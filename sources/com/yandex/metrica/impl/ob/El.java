package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class El extends Wl {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f13929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f13930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f13931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Float f13932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Float f13933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Float f13934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f13935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f13936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f13937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f13938s;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13939a;

        static {
            int[] iArr = new int[TextUtils.TruncateAt.values().length];
            f13939a = iArr;
            try {
                iArr[TextUtils.TruncateAt.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13939a[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13939a[TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13939a[TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13947a;

        b(String str) {
            this.f13947a = str;
        }
    }

    public El(String str, String str2, Wl.b bVar, int i10, boolean z10, Wl.a aVar, String str3, Float f10, Float f11, Float f12, String str4, Boolean bool, Boolean bool2, boolean z11, int i11, b bVar2) {
        super(str, str2, null, i10, z10, Wl.c.VIEW, aVar);
        this.f13927h = str3;
        this.f13928i = i11;
        this.f13931l = bVar2;
        this.f13930k = z11;
        this.f13932m = f10;
        this.f13933n = f11;
        this.f13934o = f12;
        this.f13935p = str4;
        this.f13936q = bool;
        this.f13937r = bool2;
    }

    private JSONObject a(Kl kl, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (kl.f14359a) {
                jSONObject.putOpt("sp", this.f13932m).putOpt("sd", this.f13933n).putOpt("ss", this.f13934o);
            }
            if (kl.f14360b) {
                jSONObject.put("rts", this.f13938s);
            }
            if (kl.f14362d) {
                jSONObject.putOpt("c", this.f13935p).putOpt("ib", this.f13936q).putOpt("ii", this.f13937r);
            }
            if (kl.f14361c) {
                jSONObject.put("vtl", this.f13928i).put("iv", this.f13930k).put("tst", this.f13931l.f13947a);
            }
            Integer num = this.f13929j;
            int iIntValue = num != null ? num.intValue() : this.f13927h.length();
            if (kl.f14365g) {
                jSONObject.put("tl", str.length()).put("otl", iIntValue);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public Wl.b a(C1541bl c1541bl) {
        Wl.b bVar = this.f15407c;
        return bVar == null ? c1541bl.a(this.f13927h) : bVar;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public JSONArray a(Kl kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String strSubstring = this.f13927h;
            if (strSubstring.length() > kl.f14370l) {
                this.f13929j = Integer.valueOf(this.f13927h.length());
                strSubstring = this.f13927h.substring(0, kl.f14370l);
            }
            jSONObject.put("t", "TEXT");
            jSONObject.put("vl", strSubstring);
            jSONObject.put(IntegerTokenConverter.CONVERTER_KEY, a(kl, strSubstring));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public boolean a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.Wl
    public String toString() {
        StringBuilder sbA = defpackage.a.a("TextViewElement{mText='");
        l1.c.a(sbA, this.f13927h, CoreConstants.SINGLE_QUOTE_CHAR, ", mVisibleTextLength=");
        sbA.append(this.f13928i);
        sbA.append(", mOriginalTextLength=");
        sbA.append(this.f13929j);
        sbA.append(", mIsVisible=");
        sbA.append(this.f13930k);
        sbA.append(", mTextShorteningType=");
        sbA.append(this.f13931l);
        sbA.append(", mSizePx=");
        sbA.append(this.f13932m);
        sbA.append(", mSizeDp=");
        sbA.append(this.f13933n);
        sbA.append(", mSizeSp=");
        sbA.append(this.f13934o);
        sbA.append(", mColor='");
        l1.c.a(sbA, this.f13935p, CoreConstants.SINGLE_QUOTE_CHAR, ", mIsBold=");
        sbA.append(this.f13936q);
        sbA.append(", mIsItalic=");
        sbA.append(this.f13937r);
        sbA.append(", mRelativeTextSize=");
        sbA.append(this.f13938s);
        sbA.append(", mClassName='");
        l1.c.a(sbA, this.f15405a, CoreConstants.SINGLE_QUOTE_CHAR, ", mId='");
        l1.c.a(sbA, this.f15406b, CoreConstants.SINGLE_QUOTE_CHAR, ", mParseFilterReason=");
        sbA.append(this.f15407c);
        sbA.append(", mDepth=");
        sbA.append(this.f15408d);
        sbA.append(", mListItem=");
        sbA.append(this.f15409e);
        sbA.append(", mViewType=");
        sbA.append(this.f15410f);
        sbA.append(", mClassType=");
        sbA.append(this.f15411g);
        sbA.append('}');
        return sbA.toString();
    }
}
