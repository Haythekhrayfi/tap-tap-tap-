package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.b.b.c f9770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f9771c;

    public enum a {
        VENDOR(3),
        PURPOSE(2);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9776c;

        a(int i10) {
            this.f9776c = i10;
        }
    }

    private com.applovin.impl.mediation.debugger.ui.d.c a(com.applovin.impl.b.b.b.e eVar, com.applovin.impl.b.b.b.a aVar) {
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.RIGHT_DETAIL);
        if (eVar == com.applovin.impl.b.b.b.e.f8761a) {
            aVarA.a(eVar + ".");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSpannedString(eVar.toString(), -16776961));
            spannableStringBuilder.append((CharSequence) " required for ");
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.toString(), -16776961));
            spannableStringBuilder.append((CharSequence) ".");
            aVarA.a(new SpannedString(spannableStringBuilder));
        }
        return aVarA.a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c a(String str, String str2, boolean z10) {
        return com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.RIGHT_DETAIL).a(str).b(str2).b(z10 ? -16777216 : -65536).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.mediation.debugger.ui.d.c> a() {
        ArrayList arrayList = new ArrayList(a.VENDOR.f9776c);
        boolean zC = this.f9770b.c();
        arrayList.add(a("Approved by User for Consent", String.valueOf(zC), zC));
        boolean zD = this.f9770b.d();
        arrayList.add(a("Approved by User for Legitimate Interest", String.valueOf(zD), zD));
        com.applovin.impl.b.b.b.a aVarA = this.f9770b.a();
        arrayList.add(a("Expected Ad Service Type", aVarA.toString(), aVarA == com.applovin.impl.b.b.b.a.PERSONALIZED || aVarA == com.applovin.impl.b.b.b.a.NON_PERSONALIZED));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.mediation.debugger.ui.d.c> a(int i10) {
        ArrayList arrayList = new ArrayList(a.PURPOSE.f9776c);
        arrayList.add(a(this.f9770b.b(i10), this.f9770b.a(i10)));
        arrayList.add(a("User Selection", this.f9770b.c(i10).toString(), this.f9770b.d(i10)));
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9769a;
    }

    public void initialize(com.applovin.impl.b.b.c cVar, o oVar) {
        this.f9769a = oVar;
        this.f9770b = cVar;
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                a aVar = a.VENDOR;
                return i10 == aVar.ordinal() ? aVar.f9776c : a.PURPOSE.f9776c;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return i10 == a.VENDOR.ordinal() ? new e("VENDOR INFO") : new e(android.support.v4.media.a.a("PURPOSE ", i10));
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return i10 == a.VENDOR.ordinal() ? c.this.a() : c.this.a(i10);
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return com.applovin.impl.b.b.b.EnumC0118b.values().length + 1;
            }
        };
        this.f9771c = dVar;
        dVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f9770b.b());
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9771c);
    }
}
