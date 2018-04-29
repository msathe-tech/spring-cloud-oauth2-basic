# spring-cloud-oauth2-basic
Most basic OAuth2 client using GitHub OAuth2 server

In this example we have a REST application that shows list of Meetups on the home page (i.e. http://localhost:8080). This application 
uses most basic form of OAuth2. 
Follow the steps below - 

1. Add cloud-security and cloud-oauth2 dependencies to your POM. 
2. Add @EnableOAuth2Sso to your RestContoller. There are 2 features behind @EnableOAuth2Sso: 
the OAuth2 client, and the authentication. The client is re-usable, so you can also use it to 
interact with the OAuth2 resources that your Authorization Server (in this case Github) provides. 
The authentication piece aligns your app with the rest of Spring Security, so once the dance with 
Github is over your app behaves exactly like any other secure Spring app.
3. Add application.yml with following 
security:
  oauth2:
    client:
      clientId: bd1c0a783ccdd1c9b9e4
      clientSecret: 1a9030fbca47a5b2c28e92f19050bb77824b5ad1
      accessTokenUri: https://github.com/login/oauth/access_token
      userAuthorizationUri: https://github.com/login/oauth/authorize
      clientAuthenticationScheme: form
    resource:
      userInfoUri: https://api.github.com/user
 
 In this example I've used the application 'spring-cloud-local-demo' already created on Github for trials.
 This application has callback URL set to http://localhost:8080. You can create your own application on Github
 and change the callback URL. In that case change the clientId and clientSecret in this example. 
 
 Here the application we just built is working as a client application. Once user is authenticated the Github
 OAuth2 server returns authorization code to the client. Client application then sends its client ID, secret
 and authorization code to Github OAuth2 server and get the access token back. Client application then uses the
 access token to connec to resource server to get access to resources. 
