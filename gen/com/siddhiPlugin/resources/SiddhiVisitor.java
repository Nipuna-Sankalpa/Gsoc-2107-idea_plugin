// Generated from /var/www/html/FYP/performance_testing/siddhiPlugin/src/com/siddhiPlugin/resources/Siddhi.g4 by ANTLR 4.6
package com.siddhiPlugin.resources;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SiddhiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SiddhiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SiddhiParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SiddhiParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#execution_plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_plan(SiddhiParser.Execution_planContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#execution_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_element(SiddhiParser.Execution_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_stream_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream_final(SiddhiParser.Definition_stream_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream(SiddhiParser.Definition_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_table_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table_final(SiddhiParser.Definition_table_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table(SiddhiParser.Definition_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_window_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window_final(SiddhiParser.Definition_window_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window(SiddhiParser.Definition_windowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_function_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function_final(SiddhiParser.Definition_function_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function(SiddhiParser.Definition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SiddhiParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(SiddhiParser.Language_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SiddhiParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger_final(SiddhiParser.Definition_trigger_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#definition_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger(SiddhiParser.Definition_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SiddhiParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SiddhiParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#plan_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan_annotation(SiddhiParser.Plan_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(SiddhiParser.Annotation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition(SiddhiParser.PartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#partition_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_final(SiddhiParser.Partition_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#partition_with_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_with_stream(SiddhiParser.Partition_with_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#condition_ranges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_ranges(SiddhiParser.Condition_rangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#condition_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_range(SiddhiParser.Condition_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_final(SiddhiParser.Query_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SiddhiParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#query_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_input(SiddhiParser.Query_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#standard_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stream(SiddhiParser.Standard_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#join_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stream(SiddhiParser.Join_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#join_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_source(SiddhiParser.Join_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#pattern_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_stream(SiddhiParser.Pattern_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_pattern_source_chain(SiddhiParser.Every_pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source_chain(SiddhiParser.Pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source(SiddhiParser.Pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_stateful_source(SiddhiParser.Logical_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_collection_stateful_source(SiddhiParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stateful_source(SiddhiParser.Standard_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#basic_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source(SiddhiParser.Basic_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handlers(SiddhiParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handler(SiddhiParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#sequence_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_stream(SiddhiParser.Sequence_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source_chain(SiddhiParser.Sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source(SiddhiParser.Sequence_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_collection_stateful_source(SiddhiParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#anonymous_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_stream(SiddhiParser.Anonymous_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(SiddhiParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#stream_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_function(SiddhiParser.Stream_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(SiddhiParser.WindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#query_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_section(SiddhiParser.Query_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#group_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by(SiddhiParser.Group_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(SiddhiParser.HavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#query_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_output(SiddhiParser.Query_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#output_event_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_event_type(SiddhiParser.Output_event_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#output_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate(SiddhiParser.Output_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#output_rate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate_type(SiddhiParser.Output_rate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#within_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time(SiddhiParser.Within_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#output_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_attribute(SiddhiParser.Output_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SiddhiParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SiddhiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_math_operation(SiddhiParser.Multiplication_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan_lessthan_math_operation(SiddhiParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_math_operation(SiddhiParser.Basic_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_math_operation(SiddhiParser.In_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_math_operation(SiddhiParser.Addition_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_math_operation(SiddhiParser.And_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_math_operation(SiddhiParser.Or_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_math_operation(SiddhiParser.Equality_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_math_operation(SiddhiParser.Not_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#function_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_operation(SiddhiParser.Function_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(SiddhiParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#null_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_check(SiddhiParser.Null_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#stream_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_reference(SiddhiParser.Stream_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference(SiddhiParser.Attribute_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_index(SiddhiParser.Attribute_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(SiddhiParser.Function_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#function_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_namespace(SiddhiParser.Function_namespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#stream_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_id(SiddhiParser.Stream_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#stream_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_alias(SiddhiParser.Stream_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(SiddhiParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(SiddhiParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SiddhiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(SiddhiParser.Property_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#property_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_separator(SiddhiParser.Property_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(SiddhiParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(SiddhiParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(SiddhiParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SiddhiParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#collect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect(SiddhiParser.CollectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#attribute_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_type(SiddhiParser.Attribute_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SiddhiParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(SiddhiParser.Constant_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SiddhiParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SiddhiParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#time_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_value(SiddhiParser.Time_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#year_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear_value(SiddhiParser.Year_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#month_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_value(SiddhiParser.Month_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#week_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_value(SiddhiParser.Week_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#day_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_value(SiddhiParser.Day_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#hour_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_value(SiddhiParser.Hour_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#minute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute_value(SiddhiParser.Minute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#second_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_value(SiddhiParser.Second_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#millisecond_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillisecond_value(SiddhiParser.Millisecond_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#signed_double_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_double_value(SiddhiParser.Signed_double_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#signed_long_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_long_value(SiddhiParser.Signed_long_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#signed_float_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_float_value(SiddhiParser.Signed_float_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#signed_int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int_value(SiddhiParser.Signed_int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(SiddhiParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiParser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(SiddhiParser.String_valueContext ctx);
}