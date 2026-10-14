package k9;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31939b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public e(int i10, int i11) {
        this.f31938a = i10;
        this.f31939b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final JSONArray a(JSONArray jSONArray, int i10) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            Object objOpt = jSONArray.opt(i11);
            if (objOpt instanceof JSONObject) {
                if (i10 == 0) {
                    objOpt = "...";
                } else {
                    objOpt = b((JSONObject) objOpt, i10 - 1);
                }
            } else if (objOpt instanceof JSONArray) {
                if (i10 == 0) {
                    objOpt = "...";
                } else {
                    objOpt = a((JSONArray) objOpt, i10 - 1);
                }
            }
            jSONArray2.put(objOpt);
            i11 = i12;
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public final JSONObject b(JSONObject jSONObject, int i10) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        j0.h(itKeys, "keys");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            j0.h(next, Action.KEY_ATTRIBUTE);
            if (objOpt instanceof JSONObject) {
                if (i10 == 0) {
                    objOpt = "...";
                } else {
                    objOpt = b((JSONObject) objOpt, i10 - 1);
                }
            } else if (objOpt instanceof JSONArray) {
                if (i10 == 0) {
                    objOpt = "...";
                } else {
                    objOpt = a((JSONArray) objOpt, i10 - 1);
                }
            }
            jSONObject2.put(next, objOpt);
        }
        return jSONObject2;
    }
}
