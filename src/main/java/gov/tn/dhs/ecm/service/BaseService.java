package gov.tn.dhs.ecm.service;

import com.box.sdk.BoxDeveloperEditionAPIConnection;
import gov.tn.dhs.ecm.exception.ServiceErrorException;
import gov.tn.dhs.ecm.model.ClientError;
import gov.tn.dhs.ecm.model.SimpleMessage;
import gov.tn.dhs.ecm.util.ConnectionHelper;
import gov.tn.dhs.ecm.util.JsonUtil;
import org.apache.camel.Exchange;

public abstract class BaseService {

    private final ConnectionHelper connectionHelper;

    public BaseService(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    protected abstract void process(Exchange exchange);

    protected void setupResponse(Exchange exchange, String code, Object response, Class clazz) {
        exchange.getIn().setBody(response, clazz);
        exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, code);
        exchange.getIn().setHeader("Content-Type", "application/json");
        exchange.getIn().setHeader("Accept", "application/json");
    }

    protected void setupOctetStreamResponse(Exchange exchange, String code, byte[] data) {
        exchange.getIn().setBody(data, byte[].class);
        exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, code);
        exchange.getIn().setHeader("Content-Type", "application/octet-stream");
    }

    protected void setupMessage(Exchange exchange, String code, String message) {
        SimpleMessage simpleMessage = new SimpleMessage(message);
        exchange.getIn().setBody(simpleMessage, SimpleMessage.class);
        exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, code);
        exchange.getIn().setHeader("Content-Type", "application/json");
    }

    protected void setupError(String code, String message) {
        ClientError clientError = new ClientError(code, message);
        throw new ServiceErrorException(code, JsonUtil.toJson(clientError));
    }

    protected BoxDeveloperEditionAPIConnection getBoxApiConnection() {
        BoxDeveloperEditionAPIConnection api = null;
        try {
            api = connectionHelper.getBoxDeveloperEditionAPIConnection();
        } catch (Exception e) {
            setupError("500", "Error getting Box connection");
        }
        return api;
    }

}
