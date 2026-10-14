package q8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import fd.j0;
import java.util.Objects;
import jc.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f34832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar) {
        super(0);
        this.f34832c = jVar;
    }

    @Override // uc.a
    public w invoke() throws JSONException {
        j jVar = this.f34832c;
        if (jVar.f34828g != null) {
            h hVar = jVar.f34825d;
            Objects.requireNonNull(hVar);
            JSONObject jSONObject = new JSONObject();
            if (hVar.f34817c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (Throwable th : hVar.f34817c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", u1.a.a(th));
                    jSONObject2.put("stacktrace", jc.a.b(th));
                    if (th instanceof u9.f) {
                        u9.f fVar = (u9.f) th;
                        jSONObject2.put("reason", fVar.f36171c);
                        k9.c cVar = fVar.f36172d;
                        jSONObject2.put("json_source", cVar == null ? null : cVar.a());
                        jSONObject2.put("json_summary", fVar.f36173e);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("errors", jSONArray);
            }
            if (hVar.f34818d.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (Throwable th2 : hVar.f34818d) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("warning_message", th2.getMessage());
                    jSONObject3.put("stacktrace", jc.a.b(th2));
                    jSONArray2.put(jSONObject3);
                }
                jSONObject.put("warnings", jSONArray2);
            }
            String string = jSONObject.toString(4);
            j0.h(string, "results.toString(/*indentSpaces*/ 4)");
            Object systemService = jVar.f34824c.getContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                int i10 = e9.a.f29114a;
            } else {
                clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(string)));
                Toast.makeText(jVar.f34824c.getContext(), "Error details are at your clipboard!", 0).show();
            }
        }
        return w.f31842a;
    }
}
