package r7;

import android.content.Context;
import android.renderscript.RenderScript;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Context> f35263a;

    public d(ic.a<Context> aVar) {
        this.f35263a = aVar;
    }

    @Override // ic.a
    public Object get() {
        Context context = this.f35263a.get();
        RenderScript renderScriptCreateMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        Objects.requireNonNull(renderScriptCreateMultiContext, "Cannot return null from a non-@Nullable @Provides method");
        return renderScriptCreateMultiContext;
    }
}
