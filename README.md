### Custom terms and conditions
This is a keycloak plugin which implements the keycloak required action SPI. This plugin enables you to have a second terms and conditions (ToS) required action. 
Sometimes, one has different kind of users in the same realm and need to provide different ToS.


### Usage
* In order to use this plugin, a ftl file called *custom_terms.ftl* must be present in your theme. There is no default keycloak theme so this required action won't work if the theme is not ready.
* The plugin is tested with keycloak version *11.0.2*

### build
```bash
    mvn clean package
```

### Run locally
The repository contains a docker-compose.yml file with a keycloak container and a minimal *custom_terms.ftl* so you can verify the SPI works as expected:
1. Build using `mvn clean package`
2. Run `cp ./target/custom-terms-and-conditions-0.0.1-SNAPSHOT.jar ./deployments` 
3. Run `docker-compose up`
4. Open http://localhost:9090 and login using admin/admin
5. Navigate to *Realm Settings* and open tab *Login*
6. Activate option *User Registration*
7. Navigate to *Authentication* and open tab *Required Actions*
8. Click *Register* and choose *Custom Terms and Conditions*
9. Enable option *Default Action* on the registered action
10. Open new private browser tab and navigate to http://localhost:9090

### deployment
To use this required action, copy the jar file into the *<keycloak-root>/standalone/deployments* directory.
According to the official documentation, hot deployment is possible.

