package com.applovin.impl.mediation.debugger.ui.c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f9688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f9689b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        b bVar = this.f9688a;
        if (bVar != null) {
            return bVar.a().y();
        }
        return null;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.c.b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.f9688a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    o oVarY = bVar.y();
                    com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b enumC0129bC = bVar.c();
                    if (a.this.f9688a.a(aVar)) {
                        if (com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b.READY == enumC0129bC) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerMultiAdActivity.class, oVarY.E(), new com.applovin.impl.sdk.utils.b.a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                                @Override // com.applovin.impl.sdk.utils.b.a
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public void onActivityCreated(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                    maxDebuggerMultiAdActivity.initialize(bVar);
                                }
                            });
                            return;
                        } else if (com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b.DISABLED == enumC0129bC) {
                            oVarY.as().d();
                        }
                    }
                }
                w.a(cVar.l(), cVar.m(), a.this);
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9689b = listView;
        listView.setAdapter((ListAdapter) this.f9688a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f9688a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f9688a.b();
            this.f9688a.m();
        }
    }
}
