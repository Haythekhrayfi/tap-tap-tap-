package com.yandex.mobile.ads.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.cl;
import com.yandex.mobile.ads.impl.l6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AdResponse<T> implements Parcelable {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final boolean K;
    private FalseClick L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6 f18155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SizeInfo f18159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f18160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f18161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<String> f18162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f18163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f18164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Locale f18165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f18166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AdImpressionData f18167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<Long> f18168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<Integer> f18169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f18170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f18171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f18172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final cl f18173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f18174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f18175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final MediationData f18176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RewardData f18177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Long f18178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final T f18179y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Map<String, Object> f18180z;
    public static final Integer M = 100;
    public static final Parcelable.Creator<AdResponse> CREATOR = new a();
    private static final Integer N = 1000;

    public class a implements Parcelable.Creator<AdResponse> {
        @Override // android.os.Parcelable.Creator
        public final AdResponse createFromParcel(Parcel parcel) {
            return new AdResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdResponse[] newArray(int i10) {
            return new AdResponse[i10];
        }
    }

    public static class b<T> {
        private Map<String, Object> A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private boolean H;
        private boolean I;
        private boolean J;
        private boolean K;
        private boolean L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l6 f18181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private cl f18185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<String> f18187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f18188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<String> f18189i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Long f18190j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f18191k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Locale f18192l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<String> f18193m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private FalseClick f18194n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private AdImpressionData f18195o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<Long> f18196p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<Integer> f18197q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f18198r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private MediationData f18199s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private RewardData f18200t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Long f18201u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private T f18202v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f18203w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f18204x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f18205y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f18206z;

        public final b<T> a(T t10) {
            this.f18202v = t10;
            return this;
        }

        public final AdResponse<T> a() {
            return new AdResponse<>(this, 0);
        }

        public final void a(int i10) {
            this.G = i10;
        }

        public final void a(MediationData mediationData) {
            this.f18199s = mediationData;
        }

        public final void a(RewardData rewardData) {
            this.f18200t = rewardData;
        }

        public final void a(FalseClick falseClick) {
            this.f18194n = falseClick;
        }

        public final void a(AdImpressionData adImpressionData) {
            this.f18195o = adImpressionData;
        }

        public final void a(cl clVar) {
            this.f18185e = clVar;
        }

        public final void a(l6 l6Var) {
            this.f18181a = l6Var;
        }

        public final void a(Long l10) {
            this.f18190j = l10;
        }

        public final void a(String str) {
            this.f18204x = str;
        }

        public final void a(ArrayList arrayList) {
            this.f18196p = arrayList;
        }

        public final void a(HashMap map) {
            this.A = map;
        }

        public final void a(Locale locale) {
            this.f18192l = locale;
        }

        public final void a(boolean z10) {
            this.L = z10;
        }

        public final void b(int i10) {
            this.C = i10;
        }

        public final void b(Long l10) {
            this.f18201u = l10;
        }

        public final void b(String str) {
            this.f18198r = str;
        }

        public final void b(ArrayList arrayList) {
            this.f18193m = arrayList;
        }

        public final void b(boolean z10) {
            this.I = z10;
        }

        public final void c(int i10) {
            this.E = i10;
        }

        public final void c(String str) {
            this.f18203w = str;
        }

        public final void c(ArrayList arrayList) {
            this.f18187g = arrayList;
        }

        public final void c(boolean z10) {
            this.K = z10;
        }

        public final void d(int i10) {
            this.F = i10;
        }

        public final void d(String str) {
            this.f18182b = str;
        }

        public final void d(ArrayList arrayList) {
            this.f18197q = arrayList;
        }

        public final void d(boolean z10) {
            this.H = z10;
        }

        public final void e(int i10) {
            this.B = i10;
        }

        public final void e(String str) {
            this.f18184d = str;
        }

        public final void e(ArrayList arrayList) {
            this.f18189i = arrayList;
        }

        public final void e(boolean z10) {
            this.J = z10;
        }

        public final void f(int i10) {
            this.D = i10;
        }

        public final void f(String str) {
            this.f18191k = str;
        }

        public final void f(ArrayList arrayList) {
            this.f18188h = arrayList;
        }

        public final void g(int i10) {
            this.f18186f = i10;
        }

        public final void g(String str) {
            this.f18206z = str;
        }

        public final void h(String str) {
            this.f18183c = str;
        }

        public final void i(String str) {
            this.f18205y = str;
        }
    }

    public AdResponse(Parcel parcel) {
        int i10 = parcel.readInt();
        T t10 = null;
        this.f18155a = i10 == -1 ? null : l6.values()[i10];
        this.f18156b = parcel.readString();
        this.f18157c = parcel.readString();
        this.f18158d = parcel.readString();
        this.f18159e = (SizeInfo) parcel.readParcelable(SizeInfo.class.getClassLoader());
        this.f18160f = parcel.createStringArrayList();
        this.f18161g = parcel.createStringArrayList();
        this.f18162h = parcel.createStringArrayList();
        this.f18163i = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f18164j = parcel.readString();
        this.f18165k = (Locale) parcel.readSerializable();
        this.f18166l = parcel.createStringArrayList();
        this.L = (FalseClick) parcel.readParcelable(FalseClick.class.getClassLoader());
        this.f18167m = (AdImpressionData) parcel.readParcelable(AdImpressionData.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f18168n = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f18169o = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        this.f18170p = parcel.readString();
        this.f18171q = parcel.readString();
        this.f18172r = parcel.readString();
        int i11 = parcel.readInt();
        this.f18173s = i11 == -1 ? null : cl.values()[i11];
        this.f18174t = parcel.readString();
        this.f18175u = parcel.readString();
        this.f18176v = (MediationData) parcel.readParcelable(MediationData.class.getClassLoader());
        this.f18177w = (RewardData) parcel.readParcelable(RewardData.class.getClassLoader());
        this.f18178x = (Long) parcel.readValue(Long.class.getClassLoader());
        Class cls = (Class) parcel.readSerializable();
        this.f18179y = cls != null ? (T) parcel.readValue(cls.getClassLoader()) : t10;
        this.A = parcel.readByte() != 0;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        HashMap map = new HashMap();
        this.f18180z = map;
        parcel.readMap(map, Object.class.getClassLoader());
        this.K = parcel.readBoolean();
    }

    private AdResponse(b<T> bVar) {
        this.f18155a = ((b) bVar).f18181a;
        this.f18158d = ((b) bVar).f18184d;
        this.f18156b = ((b) bVar).f18182b;
        this.f18157c = ((b) bVar).f18183c;
        int i10 = ((b) bVar).B;
        this.I = i10;
        int i11 = ((b) bVar).C;
        this.J = i11;
        this.f18159e = new SizeInfo(i10, i11, ((b) bVar).f18186f != 0 ? ((b) bVar).f18186f : 1);
        this.f18160f = ((b) bVar).f18187g;
        this.f18161g = ((b) bVar).f18188h;
        this.f18162h = ((b) bVar).f18189i;
        this.f18163i = ((b) bVar).f18190j;
        this.f18164j = ((b) bVar).f18191k;
        this.f18165k = ((b) bVar).f18192l;
        this.f18166l = ((b) bVar).f18193m;
        this.f18168n = ((b) bVar).f18196p;
        this.f18169o = ((b) bVar).f18197q;
        this.L = ((b) bVar).f18194n;
        this.f18167m = ((b) bVar).f18195o;
        this.E = ((b) bVar).D;
        this.F = ((b) bVar).E;
        this.G = ((b) bVar).F;
        this.H = ((b) bVar).G;
        this.f18170p = ((b) bVar).f18203w;
        this.f18171q = ((b) bVar).f18198r;
        this.f18172r = ((b) bVar).f18204x;
        this.f18173s = ((b) bVar).f18185e;
        this.f18174t = ((b) bVar).f18205y;
        this.f18179y = (T) ((b) bVar).f18202v;
        this.f18176v = ((b) bVar).f18199s;
        this.f18177w = ((b) bVar).f18200t;
        this.f18178x = ((b) bVar).f18201u;
        this.A = ((b) bVar).H;
        this.B = ((b) bVar).I;
        this.C = ((b) bVar).J;
        this.D = ((b) bVar).K;
        this.f18180z = ((b) bVar).A;
        this.K = ((b) bVar).L;
        this.f18175u = ((b) bVar).f18206z;
    }

    public /* synthetic */ AdResponse(b bVar, int i10) {
        this(bVar);
    }

    public final MediationData A() {
        return this.f18176v;
    }

    public final String B() {
        return this.f18157c;
    }

    public final T C() {
        return this.f18179y;
    }

    public final RewardData D() {
        return this.f18177w;
    }

    public final Long E() {
        return this.f18178x;
    }

    public final String F() {
        return this.f18174t;
    }

    public final SizeInfo G() {
        return this.f18159e;
    }

    public final boolean H() {
        return this.K;
    }

    public final boolean I() {
        return this.B;
    }

    public final boolean J() {
        return this.D;
    }

    public final boolean K() {
        return this.A;
    }

    public final boolean L() {
        return this.C;
    }

    public final boolean M() {
        return this.F > 0;
    }

    public final boolean N() {
        return this.J == 0;
    }

    public final List<String> c() {
        return this.f18161g;
    }

    public final int d() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f18172r;
    }

    public final List<Long> f() {
        return this.f18168n;
    }

    public final int g() {
        return N.intValue() * this.F;
    }

    public final int h() {
        return this.F;
    }

    public final int i() {
        return N.intValue() * this.G;
    }

    public final List<String> j() {
        return this.f18166l;
    }

    public final String k() {
        return this.f18171q;
    }

    public final List<String> l() {
        return this.f18160f;
    }

    public final String m() {
        return this.f18170p;
    }

    public final l6 n() {
        return this.f18155a;
    }

    public final String o() {
        return this.f18156b;
    }

    public final String p() {
        return this.f18158d;
    }

    public final List<Integer> q() {
        return this.f18169o;
    }

    public final int r() {
        return this.I;
    }

    public final Map<String, Object> s() {
        return this.f18180z;
    }

    public final List<String> t() {
        return this.f18162h;
    }

    public final Long u() {
        return this.f18163i;
    }

    public final cl v() {
        return this.f18173s;
    }

    public final String w() {
        return this.f18164j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l6 l6Var = this.f18155a;
        parcel.writeInt(l6Var == null ? -1 : l6Var.ordinal());
        parcel.writeString(this.f18156b);
        parcel.writeString(this.f18157c);
        parcel.writeString(this.f18158d);
        parcel.writeParcelable(this.f18159e, i10);
        parcel.writeStringList(this.f18160f);
        parcel.writeStringList(this.f18162h);
        parcel.writeValue(this.f18163i);
        parcel.writeString(this.f18164j);
        parcel.writeSerializable(this.f18165k);
        parcel.writeStringList(this.f18166l);
        parcel.writeParcelable(this.L, i10);
        parcel.writeParcelable(this.f18167m, i10);
        parcel.writeList(this.f18168n);
        parcel.writeList(this.f18169o);
        parcel.writeString(this.f18170p);
        parcel.writeString(this.f18171q);
        parcel.writeString(this.f18172r);
        cl clVar = this.f18173s;
        parcel.writeInt(clVar != null ? clVar.ordinal() : -1);
        parcel.writeString(this.f18174t);
        parcel.writeString(this.f18175u);
        parcel.writeParcelable(this.f18176v, i10);
        parcel.writeParcelable(this.f18177w, i10);
        parcel.writeValue(this.f18178x);
        parcel.writeSerializable(this.f18179y.getClass());
        parcel.writeValue(this.f18179y);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeMap(this.f18180z);
        parcel.writeBoolean(this.K);
    }

    public final String x() {
        return this.f18175u;
    }

    public final FalseClick y() {
        return this.L;
    }

    public final AdImpressionData z() {
        return this.f18167m;
    }
}
