package utils;

import com.perfecto.reportium.client.ReportiumClient;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class PerfectoElements {
    public ReportiumClient reportiumClient;
    public RemoteWebDriver remoteWebDriver;
    //Replace <<cloud name>> with your perfecto cloud name (e.g. testingcloud ) or pass it as maven properties: -DcloudName=<<cloud name>>
    public String cloudName = "trial";
    //Replace <<security token>> with your perfecto security token or pass it as maven properties: -DsecurityToken=<<SECURITY TOKEN>>  More info: https://developers.perfectomobile.com/display/PD/Generate+security+tokens
    public String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NTgzMzA2NzQsImp0aSI6ImViNzg3ZGIyLTBlMDgtNGYwZi1hMmZiLTk3NDFlMzI3MTJiNCIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6ImY3Yjg0ZTc5LTYxOGMtNDcxYi04MDAzLTlmNjRlZmVkMDYzMSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiYjcxZDFjZWMtYmY3Yi00YmU4LTkxMWEtZjUxOTRkMTIyYmRkIiwic2Vzc2lvbl9zdGF0ZSI6IjRlNTcxNWMwLTViNTktNDA3NC1hZDI2LWIzMDUxZGRmMzExOSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.dSCqdbbWhLX9puc0sAAJqDXMwAtBg3124WWu1zjOBw4";
  }
