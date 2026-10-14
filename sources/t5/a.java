package t5;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f35680b = d.a.DEFAULT;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    public static final class C0416a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f35682b;

        public C0416a(int i10, d.a aVar) {
            this.f35681a = i10;
            this.f35682b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35681a == ((C0416a) dVar).f35681a && this.f35682b.equals(((C0416a) dVar).f35682b);
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f35681a ^ 14552422) + (this.f35682b.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.f35681a + "intEncoding=" + this.f35682b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public d a() {
        return new C0416a(this.f35679a, this.f35680b);
    }
}
