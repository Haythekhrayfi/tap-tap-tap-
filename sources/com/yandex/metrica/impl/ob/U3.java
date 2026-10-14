package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class U3 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentValues f15134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResultReceiver f15135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15133c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<U3> CREATOR = new a();

    public class a implements Parcelable.Creator<U3> {
        @Override // android.os.Parcelable.Creator
        public U3 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC1819n0.class.getClassLoader());
            return new U3((ContentValues) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        @Override // android.os.Parcelable.Creator
        public U3[] newArray(int i10) {
            return new U3[i10];
        }
    }

    public U3(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f15134a = contentValues == null ? new ContentValues() : contentValues;
        this.f15135b = resultReceiver;
    }

    public U3(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f15134a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f15133c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f15135b = resultReceiver;
    }

    public U3(U3 u10) {
        synchronized (u10) {
            this.f15134a = new ContentValues(u10.f15134a);
            this.f15135b = u10.f15135b;
        }
    }

    public static U3 a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (U3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private void a(com.yandex.metrica.j jVar) {
        if (U2.a((Object) jVar.f18068c)) {
            String str = jVar.f18068c;
            synchronized (this) {
                this.f15134a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            synchronized (this) {
                this.f15134a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    public Map<String, String> a() {
        return C2120ym.d(this.f15134a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public synchronized void a(String str) {
        this.f15134a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    public synchronized void a(List<String> list) {
        this.f15134a.put("PROCESS_CFG_CUSTOM_HOSTS", C2120ym.c(list));
    }

    public synchronized void a(Map<String, String> map) {
        this.f15134a.put("PROCESS_CFG_CLIDS", C2120ym.g(map));
    }

    public List<String> b() {
        String asString = this.f15134a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C2120ym.c(asString);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000b, B:8:0x0017, B:11:0x001a, B:12:0x001b, B:13:0x001c, B:15:0x0024, B:16:0x002a, B:18:0x0036, B:21:0x0039, B:22:0x003a, B:23:0x003b, B:24:0x003e, B:17:0x002b, B:7:0x000c), top: B:29:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void b(com.yandex.metrica.j jVar) {
        Map<String, String> mapI;
        synchronized (this) {
            if (U2.a((Object) jVar.f18069d)) {
                List<String> list = jVar.f18069d;
                synchronized (this) {
                    this.f15134a.put("PROCESS_CFG_CUSTOM_HOSTS", C2120ym.c(list));
                    if (U2.a((Object) jVar.f18067b)) {
                        mapI = C2120ym.i(jVar.f18067b);
                        synchronized (this) {
                            this.f15134a.put("PROCESS_CFG_CLIDS", C2120ym.g(mapI));
                        }
                    }
                    a(jVar);
                }
            } else {
                if (U2.a((Object) jVar.f18067b)) {
                    mapI = C2120ym.i(jVar.f18067b);
                    synchronized (this) {
                        this.f15134a.put("PROCESS_CFG_CLIDS", C2120ym.g(mapI));
                    }
                }
                a(jVar);
            }
            throw th;
        }
    }

    public synchronized void b(String str) {
        this.f15134a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public ResultReceiver c() {
        return this.f15135b;
    }

    public String d() {
        return this.f15134a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f15134a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public String f() {
        return this.f15134a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public Integer g() {
        return this.f15134a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public String h() {
        return this.f15134a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public int i() {
        return this.f15134a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    public boolean j() {
        return this.f15134a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ProcessConfiguration{mParamsMapping=");
        sbA.append(this.f15134a);
        sbA.append(", mDataResultReceiver=");
        sbA.append(this.f15135b);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f15134a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f15135b);
        parcel.writeBundle(bundle);
    }
}
