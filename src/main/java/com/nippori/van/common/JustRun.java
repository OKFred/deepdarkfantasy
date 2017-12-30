package com.nippori.van.common;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;

public class JustRun {
    public static void main(String[] args) {
        try {
            String endpoint = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl";
            //直接引用远程的wsdl文件
            Service service = new Service();
            Call call = (Call)service.createCall();
            //设置URL
            call.setTargetEndpointAddress(new java.net.URL(endpoint));
            //call.setOperationName("secResetKeyNew");
            //QName: 命名空间，方法名称
            call.setOperationName(new QName("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl","getSupportCity"));
            call.addParameter("byProvinceName ", org.apache.axis.encoding.XMLType.XSD_DATE,
                    javax.xml.rpc.ParameterMode.IN);//接口的参数
      //      call.setUseSOAPAction(true);
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型，String
            //给方法传递参数，并且调用方法 //invoke 的参数是 与 “addParameter”对应，即此处的123123123是samID
            String result = (String) call.invoke(new Object[]{"杭州"});
            System.out.println("result is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
