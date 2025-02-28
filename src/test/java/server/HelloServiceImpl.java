package server;

import com.buaadaniel.rpc.idl.hello.HelloRequest;
import com.buaadaniel.rpc.idl.hello.HelloResponse;
import com.buaadaniel.rpc.idl.hello.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public HelloResponse hello(HelloRequest request) {
        String name = request.getName();
        String retMsg = "hello: " + name;
        HelloResponse response = new HelloResponse(retMsg);
        return response;
    }

    @Override
    public HelloResponse hi(HelloRequest request) {
        String name = request.getName();
        String retMsg = "hi: " + name;
        HelloResponse response = new HelloResponse(retMsg);
        return response;
    }
}
