package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1621f1 implements Parcelable {
    public static final Parcelable.Creator<C1621f1> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f16083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f16084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f16085c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f1$a */
    public class a implements uc.a<Q> {
        public a(C1621f1 c1621f1) {
        }

        @Override // uc.a
        public Q invoke() {
            return P0.i().e();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f1$b */
    public class b implements Parcelable.Creator<C1621f1> {
        @Override // android.os.Parcelable.Creator
        public C1621f1 createFromParcel(Parcel parcel) {
            return new C1621f1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1621f1[] newArray(int i10) {
            return new C1621f1[i10];
        }
    }

    public C1621f1(Parcel parcel) {
        Map<String, String> map;
        Bundle bundle = parcel.readBundle(ResultReceiverC1819n0.class.getClassLoader());
        if (bundle != null) {
            this.f16083a = (ResultReceiver) bundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f16084b = bundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            map = C2120ym.a(bundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
        } else {
            map = new HashMap<>();
        }
        this.f16085c = map;
    }

    public C1621f1(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        this.f16084b = list;
        this.f16083a = resultReceiver;
        this.f16085c = map == null ? new HashMap() : new HashMap(map);
    }

    public Map<String, String> a() {
        return this.f16085c;
    }

    public boolean a(Qi qi) {
        return Oi.a(qi, this.f16084b, this.f16085c, new a(this));
    }

    public List<String> b() {
        return this.f16084b;
    }

    public ResultReceiver c() {
        return this.f16083a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f16083a);
        if (this.f16084b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList<>(this.f16084b));
        }
        Map<String, String> map = this.f16085c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C2120ym.c(map));
        }
        parcel.writeBundle(bundle);
    }
}
