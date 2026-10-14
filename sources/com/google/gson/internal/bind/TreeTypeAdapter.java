package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import o6.d;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<T> f12785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<T> f12786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f12787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n6.a<T> f12788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f12789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f12790f = new b(this, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypeAdapter<T> f12791g;

    public static final class SingleTypeFactory implements s {
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            Class<? super T> cls = aVar.rawType;
            throw null;
        }
    }

    public final class b implements o, g {
        public b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(p<T> pVar, h<T> hVar, Gson gson, n6.a<T> aVar, s sVar) {
        this.f12785a = pVar;
        this.f12786b = hVar;
        this.f12787c = gson;
        this.f12788d = aVar;
        this.f12789e = sVar;
    }

    @Override // com.google.gson.TypeAdapter
    public T b(o6.a aVar) throws IOException {
        boolean z10;
        i iVarB;
        if (this.f12786b == null) {
            TypeAdapter<T> typeAdapterE = this.f12791g;
            if (typeAdapterE == null) {
                typeAdapterE = this.f12787c.e(this.f12789e, this.f12788d);
                this.f12791g = typeAdapterE;
            }
            return typeAdapterE.b(aVar);
        }
        try {
            try {
                aVar.V();
                z10 = false;
                try {
                    iVarB = ((TypeAdapters.AnonymousClass29) TypeAdapters.C).b(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (!z10) {
                        throw new q(e);
                    }
                    iVarB = k.f12897a;
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
            Objects.requireNonNull(iVarB);
            if (iVarB instanceof k) {
                return null;
            }
            return this.f12786b.a(iVarB, this.f12788d.type, this.f12790f);
        } catch (NumberFormatException e12) {
            throw new q(e12);
        } catch (d e13) {
            throw new q(e13);
        } catch (IOException e14) {
            throw new j(e14);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, T t10) throws IOException {
        p<T> pVar = this.f12785a;
        if (pVar == null) {
            TypeAdapter<T> typeAdapterE = this.f12791g;
            if (typeAdapterE == null) {
                typeAdapterE = this.f12787c.e(this.f12789e, this.f12788d);
                this.f12791g = typeAdapterE;
            }
            typeAdapterE.c(cVar, t10);
            return;
        }
        if (t10 == null) {
            cVar.k();
            return;
        }
        i iVarA = pVar.a(t10, this.f12788d.type, this.f12790f);
        TypeAdapters.AnonymousClass29 anonymousClass29 = (TypeAdapters.AnonymousClass29) TypeAdapters.C;
        Objects.requireNonNull(anonymousClass29);
        anonymousClass29.c(cVar, iVarA);
    }
}
