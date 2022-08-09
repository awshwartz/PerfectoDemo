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
    public String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NTk3MTMwMDcsImp0aSI6IjYxMDliYzNiLTZmYTctNDFmNS1iZGI5LTQzOGYyNGZlM2ExMiIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjA5NDMwMTQ2LTBkYTgtNDgxOS04NWMxLTFkMDcwYjllN2VkMiIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiM2QyNzc3ZWUtYzA3NC00MDc0LTk3NTktYjRhM2RjNzQ1MWI3Iiwic2Vzc2lvbl9zdGF0ZSI6ImE0YWRiZTRlLWQ4NDAtNDkzMS05Mjc0LTQ1ZjdmY2Y4MGY3MyIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.UDu_G3lqMp_M1pXHaZoQp7oU9Kw8WjApPAMMG6DoL6A";
}
