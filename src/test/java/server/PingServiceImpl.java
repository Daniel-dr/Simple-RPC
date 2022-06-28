package server;

import com.buaadaniel.rpc.idl.ping.PingRequest;
import com.buaadaniel.rpc.idl.ping.PingResponse;
import com.buaadaniel.rpc.idl.ping.PingService;

public class PingServiceImpl implements PingService {

    @Override
    public PingResponse ping(PingRequest request) {
        String name = request.getName();
        String retMsg = "pong: " + name;
        PingResponse response = new PingResponse(retMsg);
        return response;
    }
}
