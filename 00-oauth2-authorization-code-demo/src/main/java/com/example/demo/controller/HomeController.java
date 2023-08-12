package com.example.demo.controller;

import java.security.Principal;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Principal principal) {
		OAuth2AuthenticationToken oAuth2AuthenticationToken = (OAuth2AuthenticationToken) principal;
		System.out.println(oAuth2AuthenticationToken.getAuthorizedClientRegistrationId());
		System.out.println(oAuth2AuthenticationToken.getAuthorities());
		System.out.println(oAuth2AuthenticationToken.getDetails());
		System.out.println(oAuth2AuthenticationToken.getCredentials());
		System.out.println(oAuth2AuthenticationToken.getName());
		
		OAuth2User user = oAuth2AuthenticationToken.getPrincipal();
		System.out.println(user.getName());
		System.out.println(user.getAttributes());
		System.out.println(user.getAuthorities());
		
		DefaultOidcUser oidcIdToken = (DefaultOidcUser)user;
		System.out.println(oidcIdToken.getEmail());
		System.out.println(oidcIdToken.getFamilyName());
		System.out.println(oidcIdToken.getFullName());
		System.out.println(oidcIdToken.getBirthdate());
		System.out.println(oidcIdToken.getGender());
		System.out.println(oidcIdToken.getGivenName());
		System.out.println(oidcIdToken.getPhoneNumber());
		
		OidcIdToken idToken = (OidcIdToken)oidcIdToken.getIdToken();
		System.out.println(idToken.getTokenValue());
		
		System.out.println(oidcIdToken.getIdToken());
		System.out.println(oidcIdToken.getPhoneNumberVerified());
		System.out.println(oidcIdToken.getExpiresAt());
		System.out.println(oidcIdToken.getAuthenticationMethods());
		System.out.println(oidcIdToken.getAuthorizedParty());
		System.out.println(oidcIdToken.getPreferredUsername());
		System.out.println(oidcIdToken.getNickName());
		System.out.println(oidcIdToken.getZoneInfo());
		
		System.out.println(oAuth2AuthenticationToken.getPrincipal());
        return "home";
    }
}
