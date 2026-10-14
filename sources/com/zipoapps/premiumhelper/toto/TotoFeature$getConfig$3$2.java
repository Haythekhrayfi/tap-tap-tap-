package com.zipoapps.premiumhelper.toto;

import android.content.SharedPreferences;
import ed.q;
import fd.j0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jc.w;
import kc.m;
import kc.t;
import ma.f;
import oa.b;
import sa.a;
import ue.z;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature$getConfig$3$2 extends l implements uc.l<z<Map<String, ? extends Map<String, ? extends Integer>>>, w> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$3$2(TotoFeature totoFeature) {
        super(1);
        this.this$0 = totoFeature;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(z<Map<String, ? extends Map<String, ? extends Integer>>> zVar) {
        invoke2((z<Map<String, Map<String, Integer>>>) zVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(z<Map<String, Map<String, Integer>>> zVar) {
        j0.i(zVar, "result");
        Map<String, Map<String, Integer>> map = zVar.f36544b;
        if (map != null) {
            String str = zVar.f36543a.headers().get("x-country");
            if (str == null) {
                str = "";
            }
            b bVar = this.this$0.configuration;
            List<WeightedValueParameter> listAsWeightedParamsList = WeightedValueParameterKt.asWeightedParamsList(map);
            Objects.requireNonNull(bVar);
            j0.i(listAsWeightedParamsList, "config");
            a aVar = bVar.f34209f;
            Objects.requireNonNull(aVar);
            ArrayList arrayList = new ArrayList(m.j(listAsWeightedParamsList, 10));
            Iterator<T> it = listAsWeightedParamsList.iterator();
            while (it.hasNext()) {
                arrayList.add(((WeightedValueParameter) it.next()).getName());
            }
            HashSet hashSetF = t.F(arrayList);
            Set<String> setKeySet = aVar.f35499a.getAll().keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : setKeySet) {
                if (!j0.d((String) obj, "x-country")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                String str2 = (String) obj2;
                j0.h(str2, "it");
                if (!q.h(str2, "_hash", false, 2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (!hashSetF.contains((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            List<String> listH = t.H(arrayList4);
            boolean z10 = !listH.isEmpty();
            SharedPreferences.Editor editorEdit = aVar.f35499a.edit();
            editorEdit.putString("x-country", str);
            for (String str3 : listH) {
                editorEdit.remove(str3);
                editorEdit.remove(aVar.f(str3));
            }
            editorEdit.apply();
            ArrayList<WeightedValueParameter> arrayList5 = new ArrayList();
            for (Object obj4 : listAsWeightedParamsList) {
                if (!q.i(((WeightedValueParameter) obj4).getName(), b.J.f34212a, true)) {
                    arrayList5.add(obj4);
                }
            }
            for (WeightedValueParameter weightedValueParameter : arrayList5) {
                int iHash = weightedValueParameter.hash();
                String name = weightedValueParameter.getName();
                Integer numValueOf = aVar.f35499a.contains(aVar.f(name)) ? Integer.valueOf(aVar.f35499a.getInt(aVar.f(name), -1)) : null;
                if (numValueOf == null || iHash != numValueOf.intValue()) {
                    String strPickRandomValue = weightedValueParameter.pickRandomValue();
                    String name2 = weightedValueParameter.getName();
                    int iHash2 = weightedValueParameter.hash();
                    SharedPreferences.Editor editorEdit2 = aVar.f35499a.edit();
                    editorEdit2.putString(name2, strPickRandomValue);
                    editorEdit2.putInt(aVar.f(name2), iHash2);
                    editorEdit2.apply();
                    z10 = true;
                }
            }
            if (!z10) {
                f fVar = this.this$0.preferences;
                Objects.requireNonNull(fVar);
                if (oa.a.C0376a.b(fVar, "post_config_sent", false)) {
                    return;
                }
            }
            PostConfigWorker.Companion.scheduleNow(this.this$0.context);
        }
    }
}
