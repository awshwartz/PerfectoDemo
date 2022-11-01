package utils;

import Pages.PageInitializer;
import com.perfecto.reportium.client.ReportiumClient;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class PerfectoElements extends PageInitializer {
    public static final int EXPLICIT_WAIT = 15;
    public static final int IMPLICIT_WAIT = 10;
    //URLs to test
    public static String dhsHomePage = "http://www.dhs.gov";
    public static String dhsBorderSecurityPage = "https://www.dhs.gov/topics/border-security";

    public static String dhsCyberSecurityPage = "https://www.dhs.gov/topics/cybersecurity";

    //DO NOT CHANGE THESE NEXT TWO LINES
    public static ReportiumClient reportiumClient;
    public static RemoteWebDriver remoteWebDriver;

    //Replace <<cloud name>> with your perfecto cloud name (e.g. testingcloud ) or pass it as maven properties: -DcloudName=<<cloud name>>
    public static String cloudName = "trial";

    //Replace <<security token>> with your perfecto security token or pass it as maven properties: -DsecurityToken=<<SECURITY TOKEN>>  More info: https://developers.perfectomobile.com/display/PD/Generate+security+tokens
    public static String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NjczMjM0MTEsImp0aSI6ImE2NzI0MWNjLWJiODItNGRiYi05ZDU1LWUyNTA5ZTE0NTUyYyIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6ImQzOTM4N2VkLTE2MDktNGY0Ny1iZmE5LWFiYWIwYjc2MmZiZSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiZTI1Y2QwN2QtYWNkOC00YzM3LWEyY2MtOWY3MGRlNzM1MjM3Iiwic2Vzc2lvbl9zdGF0ZSI6IjYwODZjNWM1LTRlMWMtNDM1OC05NjRlLTJmZmY5MGQ4YTk0OSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.iT0NNauEtzm8PO9yC5__ZPnWVbrpaPGMKSowafyVzN8";
}
