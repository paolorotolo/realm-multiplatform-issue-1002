# Minimal Reproducible Example for Realm-Kotlin issue #1002

Unable to build Realm-Kotlin `1.2.0-ktor2-SNAPSHOT` with Kotlin `1.7.20-RC`.

Original issue link: https://github.com/realm/realm-kotlin/issues/1002

## Kotlin version
This only happens with Kotlin `1.7.20`. On branch [kotlin-1.7.10](https://github.com/paolorotolo/realm-multiplatform-issue-1002/tree/kotlin-1.7.10) you can verify that the same project compiles successifully with Kotlin downgraded to `1.7.10`.

## Steps to reproduce
 * Build the `:androidApp` project
 
## Results
Gradle build fails with:
```
org.jetbrains.kotlin.backend.common.CompilationException: Back-end: Please report this problem https://kotl.in/issue
/Users/paolorotolo/dev/nextome/MultiplatformRealmTest/shared/src/commonMain/kotlin/dev/rotolo/multiplatformrealmtest/MyException.kt:-1:-1
Details: Internal error in file lowering: java.lang.NoSuchMethodError: 'org.jetbrains.kotlin.ir.declarations.IrValueParameter org.jetbrains.kotlin.backend.common.ir.IrUtilsKt.copyTo$default(org.jetbrains.kotlin.ir.declarations.IrValueParameter, org.jetbrains.kotlin.ir.declarations.IrFunction, org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin, int, int, int, org.jetbrains.kotlin.name.Name, java.util.Map, org.jetbrains.kotlin.ir.types.IrType, org.jetbrains.kotlin.ir.types.IrType, org.jetbrains.kotlin.ir.expressions.IrExpressionBody, boolean, boolean, boolean, int, java.lang.Object)'
	at io.realm.kotlin.compiler.RealmModelSyntheticPropertiesGeneration.addVariableProperty(RealmModelSyntheticPropertiesGeneration.kt:613)
	at io.realm.kotlin.compiler.RealmModelSyntheticPropertiesGeneration.addRealmObjectInternalProperties(RealmModelSyntheticPropertiesGeneration.kt:171)
	at io.realm.kotlin.compiler.RealmModelLowering.lower(RealmModelLoweringExtension.kt:89)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitClass(Lower.kt:101)
	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitClass(IrElementVisitorVoid.kt:111)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitClass(Lower.kt:92)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitClass(Lower.kt:92)
	at org.jetbrains.kotlin.ir.declarations.IrClass.accept(IrClass.kt:64)
	at org.jetbrains.kotlin.ir.declarations.IrFile.acceptChildren(IrFile.kt:36)
	at org.jetbrains.kotlin.ir.visitors.IrVisitorsKt.acceptChildrenVoid(IrVisitors.kt:15)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitElement(Lower.kt:96)
	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitPackageFragment(IrElementVisitorVoid.kt:190)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitPackageFragment(Lower.kt:92)
	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:200)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitFile(Lower.kt:92)
	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:198)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitFile(Lower.kt:92)
	at org.jetbrains.kotlin.backend.common.ClassLoweringVisitor.visitFile(Lower.kt:92)
	at org.jetbrains.kotlin.ir.declarations.IrFile.accept(IrFile.kt:30)
	at org.jetbrains.kotlin.ir.visitors.IrVisitorsKt.acceptVoid(IrVisitors.kt:11)
	at org.jetbrains.kotlin.backend.common.LowerKt.runOnFilePostfix(Lower.kt:89)
	at org.jetbrains.kotlin.backend.common.ClassLoweringPass$DefaultImpls.lower(Lower.kt:44)
	at io.realm.kotlin.compiler.RealmModelLowering.lower(RealmModelLoweringExtension.kt:47)
	at org.jetbrains.kotlin.backend.common.LowerKt.lower(Lower.kt:75)
	at io.realm.kotlin.compiler.RealmModelLoweringExtension.generate(RealmModelLoweringExtension.kt:43)
	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr$lambda$1(JvmIrCodegenFactory.kt:183)
	at org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment(Psi2IrTranslator.kt:99)
	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr(JvmIrCodegenFactory.kt:215)
	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr(JvmIrCodegenFactory.kt:53)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.convertToIr(KotlinToJVMBytecodeCompiler.kt:230)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:113)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli$default(KotlinToJVMBytecodeCompiler.kt:58)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:158)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:53)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:99)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:47)
	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:101)
	at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:475)
	at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:125)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileIncrementally(IncrementalCompilerRunner.kt:373)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileIncrementally$default(IncrementalCompilerRunner.kt:318)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.rebuild(IncrementalCompilerRunner.kt:114)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileImpl(IncrementalCompilerRunner.kt:207)
	at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compile(IncrementalCompilerRunner.kt:79)
	at org.jetbrains.kotlin.daemon.CompileServiceImplBase.execIncrementalCompiler(CompileServiceImpl.kt:625)
	at org.jetbrains.kotlin.daemon.CompileServiceImplBase.access$execIncrementalCompiler(CompileServiceImpl.kt:101)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:1746)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at java.rmi/sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:359)
	at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:200)
	at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:197)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at java.rmi/sun.rmi.transport.Transport.serviceCall(Transport.java:196)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:562)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:796)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:677)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:676)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.NoSuchMethodError: 'org.jetbrains.kotlin.ir.declarations.IrValueParameter org.jetbrains.kotlin.backend.common.ir.IrUtilsKt.copyTo$default(org.jetbrains.kotlin.ir.declarations.IrValueParameter, org.jetbrains.kotlin.ir.declarations.IrFunction, org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin, int, int, int, org.jetbrains.kotlin.name.Name, java.util.Map, org.jetbrains.kotlin.ir.types.IrType, org.jetbrains.kotlin.ir.types.IrType, org.jetbrains.kotlin.ir.expressions.IrExpressionBody, boolean, boolean, boolean, int, java.lang.Object)'
	... 64 more
```
