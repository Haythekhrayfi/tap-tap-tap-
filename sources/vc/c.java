package vc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements cd.b, Serializable {
    public static final Object NO_RECEIVER = a.f36993c;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient cd.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36993c = new a();
    }

    public c() {
        this(NO_RECEIVER);
    }

    public c(Object obj) {
        this(obj, null, null, null, false);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // cd.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // cd.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public cd.b compute() {
        cd.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        cd.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract cd.b computeReflected();

    @Override // cd.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public cd.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return b0.a(cls);
        }
        Objects.requireNonNull(b0.f36991a);
        return new p(cls, "");
    }

    @Override // cd.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public cd.b getReflected() {
        cd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new tc.a();
    }

    @Override // cd.b
    public cd.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // cd.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // cd.b
    public cd.k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // cd.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // cd.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // cd.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // cd.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
