package z8;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.developer.filepicker.model.DialogConfigs;
import fd.j0;
import l8.a1;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45167a;

        /* JADX INFO: renamed from: z8.d$a$a, reason: collision with other inner class name */
        public static final class C0485a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0485a f45168a = new C0485a();

            public String toString() {
                return ",";
            }
        }

        public a(String str) {
            j0.i(str, "name");
            this.f45167a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j0.d(this.f45167a, ((a) obj).f45167a);
        }

        public int hashCode() {
            return this.f45167a.hashCode();
        }

        public String toString() {
            return s.a.a(defpackage.a.a("Function(name="), this.f45167a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public interface b extends d {

        public interface a extends b {

            /* JADX INFO: renamed from: z8.d$b$a$a, reason: collision with other inner class name */
            public static final class C0486a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f45169a;

                public boolean equals(Object obj) {
                    return (obj instanceof C0486a) && this.f45169a == ((C0486a) obj).f45169a;
                }

                public int hashCode() {
                    boolean z10 = this.f45169a;
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                public String toString() {
                    return "Bool(value=" + this.f45169a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }
            }

            /* JADX INFO: renamed from: z8.d$b$a$b, reason: collision with other inner class name */
            public static final class C0487b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Number f45170a;

                public boolean equals(Object obj) {
                    return (obj instanceof C0487b) && j0.d(this.f45170a, ((C0487b) obj).f45170a);
                }

                public int hashCode() {
                    return this.f45170a.hashCode();
                }

                public String toString() {
                    return "Num(value=" + this.f45170a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }
            }

            public static final class c implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f45171a;

                public boolean equals(Object obj) {
                    return (obj instanceof c) && j0.d(this.f45171a, ((c) obj).f45171a);
                }

                public int hashCode() {
                    return this.f45171a.hashCode();
                }

                public String toString() {
                    return a1.a("Str(value=", this.f45171a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            }
        }

        /* JADX INFO: renamed from: z8.d$b$b, reason: collision with other inner class name */
        public static final class C0488b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f45172a;

            public boolean equals(Object obj) {
                return (obj instanceof C0488b) && j0.d(this.f45172a, ((C0488b) obj).f45172a);
            }

            public int hashCode() {
                return this.f45172a.hashCode();
            }

            public String toString() {
                return a1.a("Variable(name=", this.f45172a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }
    }

    public interface c extends d {

        public interface a extends c {

            /* JADX INFO: renamed from: z8.d$c$a$a, reason: collision with other inner class name */
            public interface InterfaceC0489a extends a {

                /* JADX INFO: renamed from: z8.d$c$a$a$a, reason: collision with other inner class name */
                public static final class C0490a implements InterfaceC0489a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0490a f45173a = new C0490a();

                    public String toString() {
                        return ">";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$a$b */
                public static final class b implements InterfaceC0489a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f45174a = new b();

                    public String toString() {
                        return ">=";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$a$c, reason: collision with other inner class name */
                public static final class C0491c implements InterfaceC0489a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0491c f45175a = new C0491c();

                    public String toString() {
                        return "<";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$a$d, reason: collision with other inner class name */
                public static final class C0492d implements InterfaceC0489a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0492d f45176a = new C0492d();

                    public String toString() {
                        return "<=";
                    }
                }
            }

            public interface b extends a {

                /* JADX INFO: renamed from: z8.d$c$a$b$a, reason: collision with other inner class name */
                public static final class C0493a implements b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0493a f45177a = new C0493a();

                    public String toString() {
                        return "==";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$b$b, reason: collision with other inner class name */
                public static final class C0494b implements b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0494b f45178a = new C0494b();

                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* JADX INFO: renamed from: z8.d$c$a$c, reason: collision with other inner class name */
            public interface InterfaceC0495c extends a {

                /* JADX INFO: renamed from: z8.d$c$a$c$a, reason: collision with other inner class name */
                public static final class C0496a implements InterfaceC0495c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0496a f45179a = new C0496a();

                    public String toString() {
                        return DialogConfigs.DIRECTORY_SEPERATOR;
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$c$b */
                public static final class b implements InterfaceC0495c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f45180a = new b();

                    public String toString() {
                        return "%";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$c$c, reason: collision with other inner class name */
                public static final class C0497c implements InterfaceC0495c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0497c f45181a = new C0497c();

                    public String toString() {
                        return Marker.ANY_MARKER;
                    }
                }
            }

            /* JADX INFO: renamed from: z8.d$c$a$d, reason: collision with other inner class name */
            public interface InterfaceC0498d extends a {

                /* JADX INFO: renamed from: z8.d$c$a$d$a, reason: collision with other inner class name */
                public static final class C0499a implements InterfaceC0498d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0499a f45182a = new C0499a();

                    public String toString() {
                        return "&&";
                    }
                }

                /* JADX INFO: renamed from: z8.d$c$a$d$b */
                public static final class b implements InterfaceC0498d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f45183a = new b();

                    public String toString() {
                        return "||";
                    }
                }
            }

            public static final class e implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final e f45184a = new e();

                public String toString() {
                    return "^";
                }
            }

            public interface f extends a {

                /* JADX INFO: renamed from: z8.d$c$a$f$a, reason: collision with other inner class name */
                public static final class C0500a implements f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0500a f45185a = new C0500a();

                    public String toString() {
                        return "-";
                    }
                }

                public static final class b implements f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f45186a = new b();

                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f45187a = new b();

            public String toString() {
                return ":";
            }
        }

        /* JADX INFO: renamed from: z8.d$c$c, reason: collision with other inner class name */
        public static final class C0501c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0501c f45188a = new C0501c();

            public String toString() {
                return CallerData.NA;
            }
        }

        /* JADX INFO: renamed from: z8.d$c$d, reason: collision with other inner class name */
        public static final class C0502d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0502d f45189a = new C0502d();
        }

        public interface e extends c {

            public static final class a implements e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f45190a = new a();

                public String toString() {
                    return "-";
                }
            }

            public static final class b implements e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f45191a = new b();

                public String toString() {
                    return "!";
                }
            }

            /* JADX INFO: renamed from: z8.d$c$e$c, reason: collision with other inner class name */
            public static final class C0503c implements e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0503c f45192a = new C0503c();

                public String toString() {
                    return "+";
                }
            }
        }
    }
}
