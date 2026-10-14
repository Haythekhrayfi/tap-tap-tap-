package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Locale> f12370b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f12371a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Locale> f12372b = new ArrayList();

        private Builder() {
        }

        public /* synthetic */ Builder(byte[] bArr) {
        }

        public Builder addLanguage(Locale locale) {
            this.f12372b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f12371a.add(str);
            return this;
        }

        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }
    }

    public /* synthetic */ SplitInstallRequest(Builder builder) {
        this.f12369a = new ArrayList(builder.f12371a);
        this.f12370b = new ArrayList(builder.f12372b);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public List<Locale> getLanguages() {
        return this.f12370b;
    }

    public List<String> getModuleNames() {
        return this.f12369a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f12369a, this.f12370b);
    }
}
