package com.github.eddykaya;

import org.keycloak.Config;
import org.keycloak.authentication.RequiredActionFactory;
import org.keycloak.authentication.RequiredActionProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class CustomTermsAndConditionsFactory implements RequiredActionFactory {

    private static final CustomTermsAndConditions SINGLETON = new CustomTermsAndConditions();

    @Override
    public String getDisplayText() {
        return "Self Installation Terms and Conditions";
    }

    @Override
    public RequiredActionProvider create(KeycloakSession keycloakSession) {
        return SINGLETON;
    }

    @Override
    public void init(Config.Scope scope) {

    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return CustomTermsAndConditions.PROVIDER_ID;
    }
}
