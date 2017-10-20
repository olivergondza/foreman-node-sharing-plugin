package com.redhat.foreman.cli.model;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Created by shebert on 05/01/17.
 */
public class Architecture {
    private String name;

    @Override @Nonnull
    public String toString() {
        return "Architecture{" +
                "name='" + getName() + '\'' +
                ", id=" + id +
                '}';
    }

    public int id;

    @CheckForNull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull final String name) {
        this.name = name;
    }
}
