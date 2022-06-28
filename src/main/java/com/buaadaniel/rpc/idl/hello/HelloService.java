package com.buaadaniel.rpc.idl.hello;

public interface HelloService {
    HelloResponse hello(HelloRequest request);
    HelloResponse hi(HelloRequest request);
}

