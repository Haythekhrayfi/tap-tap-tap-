package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d6.s;
import d6.v;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public Bundle f12610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f12611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f12612e;

    public static class b {
        public b(s sVar, a aVar) {
            sVar.j("gcm.n.title");
            sVar.g("gcm.n.title");
            a(sVar, "gcm.n.title");
            sVar.j("gcm.n.body");
            sVar.g("gcm.n.body");
            a(sVar, "gcm.n.body");
            sVar.j("gcm.n.icon");
            if (TextUtils.isEmpty(sVar.j("gcm.n.sound2"))) {
                sVar.j("gcm.n.sound");
            }
            sVar.j("gcm.n.tag");
            sVar.j("gcm.n.color");
            sVar.j("gcm.n.click_action");
            sVar.j("gcm.n.android_channel_id");
            sVar.e();
            sVar.j("gcm.n.image");
            sVar.j("gcm.n.ticker");
            sVar.b("gcm.n.notification_priority");
            sVar.b("gcm.n.visibility");
            sVar.b("gcm.n.notification_count");
            sVar.a("gcm.n.sticky");
            sVar.a("gcm.n.local_only");
            sVar.a("gcm.n.default_sound");
            sVar.a("gcm.n.default_vibrate_timings");
            sVar.a("gcm.n.default_light_settings");
            sVar.h("gcm.n.event_time");
            sVar.d();
            sVar.k();
        }

        public static String[] a(s sVar, String str) {
            Object[] objArrF = sVar.f(str);
            if (objArrF == null) {
                return null;
            }
            String[] strArr = new String[objArrF.length];
            for (int i10 = 0; i10 < objArrF.length; i10++) {
                strArr[i10] = String.valueOf(objArrF[i10]);
            }
            return strArr;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f12610c = bundle;
    }

    public b e() {
        if (this.f12612e == null && s.l(this.f12610c)) {
            this.f12612e = new b(new s(this.f12610c), null);
        }
        return this.f12612e;
    }

    public Map<String, String> getData() {
        if (this.f12611d == null) {
            Bundle bundle = this.f12610c;
            q.a aVar = new q.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f12611d = aVar;
        }
        return this.f12611d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f12610c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
