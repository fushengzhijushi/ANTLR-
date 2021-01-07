// Generated from C.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code definarrayvar}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void enterDefinarrayvar(@NotNull CParser.DefinarrayvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definarrayvar}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void exitDefinarrayvar(@NotNull CParser.DefinarrayvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#else_if_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_part(@NotNull CParser.Else_if_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#else_if_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_part(@NotNull CParser.Else_if_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#bot}.
	 * @param ctx the parse tree
	 */
	void enterBot(@NotNull CParser.BotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#bot}.
	 * @param ctx the parse tree
	 */
	void exitBot(@NotNull CParser.BotContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(@NotNull CParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(@NotNull CParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#defvarfun}.
	 * @param ctx the parse tree
	 */
	void enterDefvarfun(@NotNull CParser.DefvarfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#defvarfun}.
	 * @param ctx the parse tree
	 */
	void exitDefvarfun(@NotNull CParser.DefvarfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unequal}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnequal(@NotNull CParser.UnequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unequal}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnequal(@NotNull CParser.UnequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(@NotNull CParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(@NotNull CParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull CParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull CParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(@NotNull CParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(@NotNull CParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(@NotNull CParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(@NotNull CParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfdecrease}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void enterSelfdecrease(@NotNull CParser.SelfdecreaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfdecrease}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void exitSelfdecrease(@NotNull CParser.SelfdecreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structure_body}.
	 * @param ctx the parse tree
	 */
	void enterStructure_body(@NotNull CParser.Structure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structure_body}.
	 * @param ctx the parse tree
	 */
	void exitStructure_body(@NotNull CParser.Structure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull CParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull CParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull CParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull CParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull CParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull CParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greater}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void enterGreater(@NotNull CParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void exitGreater(@NotNull CParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#struct_body_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body_body(@NotNull CParser.Struct_body_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_body_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body_body(@NotNull CParser.Struct_body_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull CParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull CParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(@NotNull CParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(@NotNull CParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condition_part}.
	 * @param ctx the parse tree
	 */
	void enterCondition_part(@NotNull CParser.Condition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condition_part}.
	 * @param ctx the parse tree
	 */
	void exitCondition_part(@NotNull CParser.Condition_partContext ctx);
	/**
	 * Enter a parse tree produced by the {@code desimplevar}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void enterDesimplevar(@NotNull CParser.DesimplevarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code desimplevar}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void exitDesimplevar(@NotNull CParser.DesimplevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(@NotNull CParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(@NotNull CParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(@NotNull CParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(@NotNull CParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#return_val}.
	 * @param ctx the parse tree
	 */
	void enterReturn_val(@NotNull CParser.Return_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#return_val}.
	 * @param ctx the parse tree
	 */
	void exitReturn_val(@NotNull CParser.Return_valContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void enterLess(@NotNull CParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void exitLess(@NotNull CParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(@NotNull CParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(@NotNull CParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#both}.
	 * @param ctx the parse tree
	 */
	void enterBoth(@NotNull CParser.BothContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#both}.
	 * @param ctx the parse tree
	 */
	void exitBoth(@NotNull CParser.BothContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineassign}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void enterDefineassign(@NotNull CParser.DefineassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineassign}
	 * labeled alternative in {@link CParser#tem}.
	 * @param ctx the parse tree
	 */
	void exitDefineassign(@NotNull CParser.DefineassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull CParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull CParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull CParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link CParser#conexpr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull CParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull CParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull CParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(@NotNull CParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(@NotNull CParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#if_lable}.
	 * @param ctx the parse tree
	 */
	void enterIf_lable(@NotNull CParser.If_lableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#if_lable}.
	 * @param ctx the parse tree
	 */
	void exitIf_lable(@NotNull CParser.If_lableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfincrease}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void enterSelfincrease(@NotNull CParser.SelfincreaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfincrease}
	 * labeled alternative in {@link CParser#assign_rear}.
	 * @param ctx the parse tree
	 */
	void exitSelfincrease(@NotNull CParser.SelfincreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#for_lable}.
	 * @param ctx the parse tree
	 */
	void enterFor_lable(@NotNull CParser.For_lableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#for_lable}.
	 * @param ctx the parse tree
	 */
	void exitFor_lable(@NotNull CParser.For_lableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull CParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull CParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterIf_part(@NotNull CParser.If_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitIf_part(@NotNull CParser.If_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#while_lable}.
	 * @param ctx the parse tree
	 */
	void enterWhile_lable(@NotNull CParser.While_lableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#while_lable}.
	 * @param ctx the parse tree
	 */
	void exitWhile_lable(@NotNull CParser.While_lableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#atomc}.
	 * @param ctx the parse tree
	 */
	void enterAtomc(@NotNull CParser.AtomcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#atomc}.
	 * @param ctx the parse tree
	 */
	void exitAtomc(@NotNull CParser.AtomcContext ctx);
}