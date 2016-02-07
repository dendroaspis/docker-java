package com.github.dockerjava.api.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class AuthConfig {

    /**
     * For backwards compatibility. Make sure you update the properties if you change this.
     *
     * @see "/docker.io.properties"
     */
    public static final String DEFAULT_SERVER_ADDRESS = "https://index.docker.io/v1/";

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    @JsonProperty
    private String email;

    @JsonProperty("serveraddress")
    private String serverAddress = DEFAULT_SERVER_ADDRESS;

    @JsonProperty("auth")
    private String auth;

    public String getUsername() {
        return username;
    }

    public AuthConfig withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AuthConfig withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AuthConfig withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public AuthConfig withServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }

    public String getAuth() {
        return auth;
    }

    public AuthConfig withAuth(String auth) {
        this.auth = auth;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    // CHECKSTYLE:OFF
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((auth == null) ? 0 : auth.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((serverAddress == null) ? 0 : serverAddress.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AuthConfig other = (AuthConfig) obj;
        if (auth == null) {
            if (other.auth != null)
                return false;
        } else if (!auth.equals(other.auth))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (serverAddress == null) {
            if (other.serverAddress != null)
                return false;
        } else if (!serverAddress.equals(other.serverAddress))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
    // CHECKSTYLE:ON
}
