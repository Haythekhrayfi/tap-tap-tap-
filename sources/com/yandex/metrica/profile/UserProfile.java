package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Hf;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<UserProfileUpdate<? extends Hf>> f18121a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedList<UserProfileUpdate<? extends Hf>> f18122a = new LinkedList<>();

        public Builder apply(UserProfileUpdate<? extends Hf> userProfileUpdate) {
            this.f18122a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f18122a, null);
        }
    }

    public UserProfile(List list, a aVar) {
        this.f18121a = Collections.unmodifiableList(list);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<UserProfileUpdate<? extends Hf>> getUserProfileUpdates() {
        return this.f18121a;
    }
}
