package com.buaadaniel.rpc.idl.ping;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PingRequest implements Serializable {
    private String name;
}
