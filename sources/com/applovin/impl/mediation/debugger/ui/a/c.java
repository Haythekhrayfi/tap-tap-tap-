package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallKeywordsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.a f9573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f9574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f9575c;

    public enum a {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.debugger.ui.d.c a(String str) {
        return com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.RIGHT_DETAIL).a(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.debugger.ui.d.c a(String str, String str2) {
        return com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.RIGHT_DETAIL).a(str).b(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(str.equals("m") ? "Male" : str.equals("f") ? "Female" : "Unknown");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.ui.d.a aVar2, o oVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(aVar, aVar.f().get(aVar2.a()), null, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.ui.d.a aVar2, o oVar, MaxDebuggerWaterfallKeywordsActivity maxDebuggerWaterfallKeywordsActivity) {
        com.applovin.impl.mediation.debugger.b.a.b bVar = aVar.f().get(aVar2.a());
        maxDebuggerWaterfallKeywordsActivity.initialize(bVar.a(), bVar.c().f(), oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final o oVar, final com.applovin.impl.mediation.debugger.b.a.a aVar, final com.applovin.impl.mediation.debugger.ui.d.a aVar2, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
        Class cls;
        com.applovin.impl.sdk.a aVarE;
        com.applovin.impl.sdk.utils.b.a aVar3;
        if (aVar2.b() == 0) {
            cls = MaxDebuggerAdUnitDetailActivity.class;
            aVarE = oVar.E();
            final int i10 = 0;
            aVar3 = new com.applovin.impl.sdk.utils.b.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.j
                @Override // com.applovin.impl.sdk.utils.b.a
                public final void onActivityCreated(Activity activity) {
                    switch (i10) {
                        case 0:
                            c.a(aVar, aVar2, oVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            c.a(aVar, aVar2, oVar, (MaxDebuggerWaterfallKeywordsActivity) activity);
                            break;
                    }
                }
            };
        } else {
            if (!cVar.k().toString().equals("Keywords")) {
                return;
            }
            cls = MaxDebuggerWaterfallKeywordsActivity.class;
            aVarE = oVar.E();
            final int i11 = 1;
            aVar3 = new com.applovin.impl.sdk.utils.b.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.j
                @Override // com.applovin.impl.sdk.utils.b.a
                public final void onActivityCreated(Activity activity) {
                    switch (i11) {
                        case 0:
                            c.a(aVar, aVar2, oVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            c.a(aVar, aVar2, oVar, (MaxDebuggerWaterfallKeywordsActivity) activity);
                            break;
                    }
                }
            };
        }
        com.applovin.impl.sdk.utils.b.a(this, cls, aVarE, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.debugger.ui.d.c b(List<String> list) {
        return com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL).a("Keywords").b(StringUtils.createSpannedString(list.size() + " keyword group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        return str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        return str.equals("tablet") ? "Tablets" : "All";
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9574b;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.a.a aVar, o oVar) {
        this.f9573a = aVar;
        this.f9574b = oVar;
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                com.applovin.impl.mediation.debugger.b.a.b bVar = aVar.f().get(i10);
                int i11 = bVar.b() != null ? 1 : 0;
                int i12 = 2;
                com.applovin.impl.mediation.debugger.b.a.f fVarC = bVar.c();
                if (fVarC.c() != null && fVarC.d() != null) {
                    i12 = 3;
                }
                if (fVarC.e() != null) {
                    i12++;
                }
                if (fVarC.f() != null) {
                    i12++;
                }
                return i11 + 1 + i12;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                if (i10 == a.TARGETED_WATERFALL.ordinal()) {
                    return new com.applovin.impl.mediation.debugger.ui.d.e("TARGETED WATERFALL FOR CURRENT DEVICE");
                }
                return i10 == a.OTHER_WATERFALLS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("OTHER WATERFALLS") : new com.applovin.impl.mediation.debugger.ui.d.e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                ArrayList arrayList = new ArrayList();
                com.applovin.impl.mediation.debugger.b.a.b bVar = aVar.f().get(i10);
                arrayList.add(c.this.a(bVar.a()));
                if (bVar.b() != null) {
                    arrayList.add(c.this.a("AB Test Experiment Name", bVar.b()));
                }
                com.applovin.impl.mediation.debugger.b.a.f fVarC = bVar.c();
                c cVar = c.this;
                arrayList.add(cVar.a("Device ID Targeting", cVar.b(fVarC.a())));
                c cVar2 = c.this;
                arrayList.add(cVar2.a("Device Type Targeting", cVar2.c(fVarC.b())));
                if (fVarC.e() != null) {
                    c cVar3 = c.this;
                    arrayList.add(cVar3.a("Gender", cVar3.a(fVarC.e())));
                }
                if (fVarC.c() != null && fVarC.d() != null) {
                    arrayList.add(c.this.a("Age", fVarC.c() + "-" + fVarC.d()));
                }
                if (fVarC.f() != null) {
                    arrayList.add(c.this.b(fVarC.f()));
                }
                return arrayList;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return aVar.f().size();
            }
        };
        this.f9575c = dVar;
        dVar.a(new com.applovin.exoplayer2.a.f(this, oVar, aVar));
        this.f9575c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f9573a.b());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f9575c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.applovin.impl.mediation.debugger.ui.d.d dVar = this.f9575c;
        if (dVar != null) {
            dVar.a((com.applovin.impl.mediation.debugger.ui.d.d.a) null);
        }
    }
}
