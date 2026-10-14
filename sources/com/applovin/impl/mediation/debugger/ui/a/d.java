package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f9582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f9585e;

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.a(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.c(), -16777216));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL).a(StringUtils.createSpannedString(aVar.b(), -16777216, 18, 1)).b(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final o oVar, com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
        final com.applovin.impl.mediation.debugger.b.a.a aVar2 = (com.applovin.impl.mediation.debugger.b.a.a) list.get(aVar.b());
        final int i10 = 1;
        if (aVar2.f().size() != 1) {
            com.applovin.impl.sdk.utils.b.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, oVar.E(), new com.applovin.impl.sdk.utils.b.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.k
                @Override // com.applovin.impl.sdk.utils.b.a
                public final void onActivityCreated(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(aVar2, null, null, oVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(aVar2, oVar);
                            break;
                    }
                }
            });
        } else {
            final int i11 = 0;
            com.applovin.impl.sdk.utils.b.a(this, MaxDebuggerAdUnitDetailActivity.class, oVar.E(), new com.applovin.impl.sdk.utils.b.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.k
                @Override // com.applovin.impl.sdk.utils.b.a
                public final void onActivityCreated(Activity activity) {
                    switch (i11) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(aVar2, null, null, oVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(aVar2, oVar);
                            break;
                    }
                }
            });
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9581a;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.a.a> list, boolean z10, o oVar) {
        this.f9584d = z10;
        this.f9581a = oVar;
        this.f9583c = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new com.applovin.impl.mediation.debugger.ui.d.e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return d.this.f9583c;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return 1;
            }
        };
        this.f9582b = dVar;
        dVar.a(new com.applovin.exoplayer2.a.f(this, list, oVar));
        this.f9582b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9584d ? "Selective Init " : "");
        sb2.append("Ad Units");
        setTitle(sb2.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9585e = listView;
        listView.setAdapter((ListAdapter) this.f9582b);
    }
}
