### Custom terms and conditions
This is a keycloak plugin which implements the keycloak required action SPI. This plugin enables you to have a second terms and conditions (ToS) required action. 
Sometimes, one has different kind of users in the same realm and need to provide different ToS.


### Usage
* In order to use this plugin, a ftl file called *custom_terms.ftl* must be present in your theme. There is no default keycloak theme so this required action won't work if the theme is not ready.
* The plugin is tested with keycloak version *4.1.0-Final*

### build
```bash
    mvn clean package
```

### deployment
To use this required action, copy the jar file into the *<keycloak-root>/standalone/deployments* directory.
According to the official documentation, hot deployment is possible.

