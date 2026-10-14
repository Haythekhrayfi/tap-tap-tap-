package com.applovin.impl.mediation.debugger.ui.b;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f9613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f9614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f9615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f9616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.adview.a f9617e;

    private void a() {
        String strL = this.f9613a.l();
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strL);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        if (!StringUtils.isValidString(this.f9613a.h()) || this.f9613a.b()) {
            return;
        }
        this.f9613a.a(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                w.a(a.this.f9613a.g(), a.this.f9613a.h(), context);
            }
        });
    }

    private void b() {
        c();
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(this, 50, R.attr.progressBarStyleLarge);
        this.f9617e = aVar;
        aVar.setColor(-3355444);
        this.f9615c.addView(this.f9617e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f9615c.bringChildToFront(this.f9617e);
        this.f9617e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.adview.a aVar = this.f9617e;
        if (aVar != null) {
            aVar.b();
            this.f9615c.removeView(this.f9617e);
            this.f9617e = null;
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        b bVar = this.f9613a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f9615c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f9616d = listView;
        listView.setAdapter((ListAdapter) this.f9613a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f9613a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f9614b);
            this.f9613a.a((d.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        b bVar = this.f9613a;
        if (bVar == null || bVar.a()) {
            return;
        }
        b();
    }

    public void setListAdapter(b bVar, final com.applovin.impl.sdk.a aVar) {
        DataSetObserver dataSetObserver;
        b bVar2 = this.f9613a;
        if (bVar2 != null && (dataSetObserver = this.f9614b) != null) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f9613a = bVar;
        this.f9614b = new DataSetObserver() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                a.this.c();
                a aVar2 = a.this;
                aVar2.a((Context) aVar2);
            }
        };
        a((Context) this);
        this.f9613a.registerDataSetObserver(this.f9614b);
        this.f9613a.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final c cVar) {
                a aVar3;
                com.applovin.impl.sdk.a aVar4;
                com.applovin.impl.sdk.utils.b.a<MaxDebuggerAdUnitsListActivity> aVar5;
                a aVar6;
                Class cls;
                com.applovin.impl.sdk.a aVar7;
                com.applovin.impl.sdk.utils.b.a aVar8;
                int iA = aVar2.a();
                if (iA != b.d.APP_INFO.ordinal()) {
                    if (iA != b.d.MAX.ordinal()) {
                        if (iA != b.d.PRIVACY.ordinal()) {
                            if (iA != b.d.ADS.ordinal()) {
                                if ((iA == b.d.INCOMPLETE_NETWORKS.ordinal() || iA == b.d.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof com.applovin.impl.mediation.debugger.ui.b.a.a)) {
                                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerDetailActivity.class, aVar, new com.applovin.impl.sdk.utils.b.a<MaxDebuggerDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.6
                                        @Override // com.applovin.impl.sdk.utils.b.a
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public void onActivityCreated(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                                            maxDebuggerDetailActivity.initialize(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).f());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (aVar2.b() == b.a.AD_UNITS.ordinal()) {
                                if (a.this.f9613a.d().size() <= 0) {
                                    w.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", a.this);
                                    return;
                                } else {
                                    aVar3 = a.this;
                                    aVar4 = aVar;
                                    aVar5 = new com.applovin.impl.sdk.utils.b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.2
                                        @Override // com.applovin.impl.sdk.utils.b.a
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public void onActivityCreated(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                            maxDebuggerAdUnitsListActivity.initialize(a.this.f9613a.d(), false, a.this.f9613a.c());
                                        }
                                    };
                                }
                            } else {
                                if (aVar2.b() == b.a.SELECT_LIVE_NETWORKS.ordinal()) {
                                    if (a.this.f9613a.i().size() > 0 || a.this.f9613a.j().size() > 0) {
                                        if (!a.this.f9613a.c().as().a()) {
                                            aVar6 = a.this;
                                            cls = MaxDebuggerTestLiveNetworkActivity.class;
                                            aVar7 = aVar;
                                            aVar8 = new com.applovin.impl.sdk.utils.b.a<MaxDebuggerTestLiveNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.3
                                                @Override // com.applovin.impl.sdk.utils.b.a
                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public void onActivityCreated(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                                    maxDebuggerTestLiveNetworkActivity.initialize(a.this.f9613a.i(), a.this.f9613a.j(), a.this.f9613a.c());
                                                }
                                            };
                                        }
                                        w.a("Restart Required", cVar.m(), a.this);
                                        return;
                                    }
                                    w.a("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                                    return;
                                }
                                if (aVar2.b() == b.a.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                                    if (!a.this.f9613a.c().as().a()) {
                                        a.this.getSdk().as().d();
                                        w.a("Restart Required", cVar.m(), a.this);
                                        return;
                                    }
                                    if (a.this.f9613a.k().size() > 0) {
                                        aVar6 = a.this;
                                        cls = MaxDebuggerTestModeNetworkActivity.class;
                                        aVar7 = aVar;
                                        aVar8 = new com.applovin.impl.sdk.utils.b.a<MaxDebuggerTestModeNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.4
                                            @Override // com.applovin.impl.sdk.utils.b.a
                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public void onActivityCreated(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                                                maxDebuggerTestModeNetworkActivity.initialize(a.this.f9613a.k(), a.this.f9613a.c());
                                            }
                                        };
                                    }
                                    w.a("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                                    return;
                                }
                                if (aVar2.b() != b.a.INITIALIZATION_AD_UNITS.ordinal()) {
                                    return;
                                }
                                aVar3 = a.this;
                                aVar4 = aVar;
                                aVar5 = new com.applovin.impl.sdk.utils.b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.5
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public void onActivityCreated(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                        maxDebuggerAdUnitsListActivity.initialize(a.this.f9613a.f(), true, a.this.f9613a.c());
                                    }
                                };
                            }
                            com.applovin.impl.sdk.utils.b.a(aVar3, MaxDebuggerAdUnitsListActivity.class, aVar4, aVar5);
                            return;
                        }
                        if (!StringUtils.isValidString(a.this.f9613a.c().ab().a())) {
                            w.a("", cVar.m(), a.this);
                            return;
                        }
                        aVar6 = a.this;
                        cls = MaxDebuggerTcfInfoListActivity.class;
                        aVar7 = aVar;
                        aVar8 = new com.applovin.impl.sdk.utils.b.a<MaxDebuggerTcfInfoListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.1
                            @Override // com.applovin.impl.sdk.utils.b.a
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onActivityCreated(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                                maxDebuggerTcfInfoListActivity.initialize(a.this.f9613a.c());
                            }
                        };
                        com.applovin.impl.sdk.utils.b.a(aVar6, cls, aVar7, aVar8);
                        return;
                    }
                    o oVarC = a.this.f9613a.c();
                    if (oVarC.aa().b()) {
                        if (aVar2.b() == b.c.PRIVACY_POLICY_URL.ordinal()) {
                            if (oVarC.aa().d() != null) {
                                u.a(oVarC.aa().d(), o.au(), oVarC);
                                return;
                            } else {
                                w.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", a.this);
                                return;
                            }
                        }
                        if (aVar2.b() == b.c.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (oVarC.aa().e() != null) {
                                u.a(oVarC.aa().e(), o.au(), oVarC);
                                return;
                            }
                            return;
                        }
                    }
                }
                w.a(cVar.l(), cVar.m(), a.this);
            }
        });
    }
}
