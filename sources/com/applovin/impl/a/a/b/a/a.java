package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f8275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f8276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f8277c;

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f8276b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8276b.bringChildToFront(textView);
    }

    public void a(b bVar, final com.applovin.impl.sdk.a aVar) {
        this.f8275a = bVar;
        bVar.a(new d.a() { // from class: com.applovin.impl.a.a.b.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(final com.applovin.impl.mediation.debugger.ui.d.a aVar2, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (aVar2.a() != b.a.RECENT_ADS.ordinal()) {
                    return;
                }
                com.applovin.impl.sdk.utils.b.a(a.this, MaxCreativeDebuggerDisplayedAdActivity.class, aVar, new com.applovin.impl.sdk.utils.b.a<MaxCreativeDebuggerDisplayedAdActivity>() { // from class: com.applovin.impl.a.a.b.a.a.1.1
                    @Override // com.applovin.impl.sdk.utils.b.a
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onActivityCreated(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                        maxCreativeDebuggerDisplayedAdActivity.a(a.this.f8275a.d().get(aVar2.b()), a.this.f8275a.c());
                    }
                });
            }
        });
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f8276b = (FrameLayout) findViewById(android.R.id.content);
        this.f8277c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f8275a;
        if (bVar != null) {
            bVar.a((d.a) null);
            this.f8275a.a();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        int i10;
        super.onStart();
        this.f8277c.setAdapter((ListAdapter) this.f8275a);
        b bVar = this.f8275a;
        if (bVar == null || bVar.c().ac().d()) {
            b bVar2 = this.f8275a;
            if (bVar2 == null || !bVar2.b()) {
                return;
            } else {
                i10 = R.string.applovin_creative_debugger_no_ads_text;
            }
        } else {
            i10 = R.string.applovin_creative_debugger_disabled_text;
        }
        a(i10);
    }
}
