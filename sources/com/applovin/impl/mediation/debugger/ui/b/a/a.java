package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f9630a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f9631o;

    public a(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(c.b.DETAIL);
        this.f9630a = bVar;
        this.f9631o = context;
        this.f9717d = q();
        this.f9718e = r();
    }

    private SpannedString q() {
        return StringUtils.createSpannedString(this.f9630a.i(), c() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString r() {
        if (!c()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) s());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) t());
        if (this.f9630a.a() == com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!this.f9630a.d()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f9630a.j())) {
            return StringUtils.createListItemDetailSpannedString(this.f9630a.e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f9630a.j(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        if (!this.f9630a.e()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f9630a.k())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f9630a.k(), -16777216));
        if (this.f9630a.f()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f9630a.l(), -16777216));
        }
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int a() {
        return c() ? R.drawable.applovin_ic_disclosure_arrow : super.g();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.f9631o);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return this.f9630a.a() != com.applovin.impl.mediation.debugger.b.c.b.a.MISSING;
    }

    public com.applovin.impl.mediation.debugger.b.c.b f() {
        return this.f9630a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int g() {
        int iO = this.f9630a.o();
        return iO > 0 ? iO : R.drawable.applovin_ic_mediation_placeholder;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediatedNetworkListItemViewModel{text=");
        sbA.append((Object) this.f9717d);
        sbA.append(", detailText=");
        sbA.append((Object) this.f9718e);
        sbA.append(", network=");
        sbA.append(this.f9630a);
        sbA.append("}");
        return sbA.toString();
    }
}
