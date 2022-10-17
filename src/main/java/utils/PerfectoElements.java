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
    public static String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NjYwMTAyNjUsImp0aSI6ImY4YWNlNmY3LWQ1MTUtNDY2NS1hZjA5LTkwZDBlNGI3YjM4MSIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6ImMwZGYxODMwLWFhOWUtNDNjMy1iNmIzLWE0MjZiOTQ0Y2IzNCIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiZWMxOWM3ODEtNDYzOS00NjQyLThmYjctNDZhMzZmNDM5YTYwIiwic2Vzc2lvbl9zdGF0ZSI6IjA5NzVkMWVhLWQ2NTYtNDQ4OS05NTAyLTBiZTQyYzI0YjRlNSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ._wJUm_FdiCqoc1KoOB5ERdSq1nBG531MUcWuCxAm1zU";
}
