package ta;

import android.content.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.util.FileSize;
import fd.j0;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends xe.a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f35871c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    static {
        new a(null);
    }

    public b(Context context, boolean z10) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f35870b = z10;
        this.f35871c = LoggerFactory.getLogger("PremiumHelper");
        String str = context.getFilesDir().getAbsolutePath() + "/premium_helper.log";
        String str2 = context.getFilesDir().getAbsolutePath() + "/premium_helper.log.%i";
        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
        j0.g(iLoggerFactory, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
        LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
        loggerContext.reset();
        RollingFileAppender rollingFileAppender = new RollingFileAppender();
        rollingFileAppender.setContext(loggerContext);
        rollingFileAppender.setFile(str);
        FixedWindowRollingPolicy fixedWindowRollingPolicy = new FixedWindowRollingPolicy();
        fixedWindowRollingPolicy.setContext(loggerContext);
        fixedWindowRollingPolicy.setFileNamePattern(str2);
        fixedWindowRollingPolicy.setParent(rollingFileAppender);
        fixedWindowRollingPolicy.setMaxIndex(2);
        fixedWindowRollingPolicy.setMinIndex(1);
        fixedWindowRollingPolicy.start();
        SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy = new SizeBasedTriggeringPolicy();
        sizeBasedTriggeringPolicy.setMaxFileSize(FileSize.valueOf(String.valueOf(z10 ? 5242880 : 512000)));
        sizeBasedTriggeringPolicy.start();
        PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
        patternLayoutEncoder.setContext(loggerContext);
        patternLayoutEncoder.setPattern("%d{yyyy-MM-dd HH:mm:ss.SSS} %-5level %logger{36} - %msg%n");
        patternLayoutEncoder.start();
        rollingFileAppender.setEncoder(patternLayoutEncoder);
        rollingFileAppender.setRollingPolicy(fixedWindowRollingPolicy);
        rollingFileAppender.setTriggeringPolicy(sizeBasedTriggeringPolicy);
        rollingFileAppender.start();
        Logger logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        j0.g(logger, "null cannot be cast to non-null type ch.qos.logback.classic.Logger");
        ch.qos.logback.classic.Logger logger2 = (ch.qos.logback.classic.Logger) logger;
        logger2.addAppender(rollingFileAppender);
        logger2.setLevel(Level.DEBUG);
    }

    @Override // xe.a.c
    public boolean h(String str, int i10) {
        return this.f35870b || !(i10 == 2 || i10 == 3 || i10 == 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r5 == null) goto L23;
     */
    @Override // xe.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
            r1 = this;
            java.lang.String r0 = "message"
            fd.j0.i(r4, r0)
            boolean r0 = r1.h(r3, r2)
            if (r0 == 0) goto L5f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L12
            goto L26
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 58
            r0.append(r3)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L26:
            switch(r2) {
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L46;
                case 5: goto L3a;
                case 6: goto L2c;
                case 7: goto L52;
                default: goto L29;
            }
        L29:
            if (r5 != 0) goto L34
            goto L54
        L2c:
            if (r5 != 0) goto L34
            org.slf4j.Logger r2 = r1.f35871c
            r2.error(r4)
            goto L5f
        L34:
            org.slf4j.Logger r2 = r1.f35871c
            r2.error(r4, r5)
            goto L5f
        L3a:
            org.slf4j.Logger r2 = r1.f35871c
            if (r5 != 0) goto L42
            r2.warn(r4)
            goto L5f
        L42:
            r2.warn(r4, r5)
            goto L5f
        L46:
            org.slf4j.Logger r2 = r1.f35871c
            if (r5 != 0) goto L4e
            r2.info(r4)
            goto L5f
        L4e:
            r2.info(r4, r5)
            goto L5f
        L52:
            if (r5 != 0) goto L5a
        L54:
            org.slf4j.Logger r2 = r1.f35871c
            r2.debug(r4)
            goto L5f
        L5a:
            org.slf4j.Logger r2 = r1.f35871c
            r2.debug(r4, r5)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.b.i(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}
