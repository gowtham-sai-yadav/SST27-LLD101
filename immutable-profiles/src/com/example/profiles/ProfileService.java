package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        return UserProfile.builder(id, email).build();
    }

    public void updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        throw new UnsupportedOperationException("UserProfile is immutable. Create a new instance using toBuilder().");
    }
}
