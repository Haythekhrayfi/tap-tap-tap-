package com.applovin.impl.communicator;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class CommunicatorMessageImpl extends Intent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8955a;
    public final Bundle data;
    public final WeakReference<AppLovinCommunicatorPublisher> publisherRef;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.f8955a = UUID.randomUUID().toString();
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    public String getUniqueId() {
        return this.f8955a;
    }

    @Override // android.content.Intent
    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinCommunicatorMessage{publisherId=");
        sbA.append(getPublisherId());
        sbA.append(", topic=");
        sbA.append(getTopic());
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append(", uniqueId='");
        l1.c.a(sbA, this.f8955a, CoreConstants.SINGLE_QUOTE_CHAR, ", data=");
        sbA.append(this.data);
        sbA.append('}');
        return sbA.toString();
    }
}
