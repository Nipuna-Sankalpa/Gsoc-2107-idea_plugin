// Generated from /var/www/html/FYP/performance_testing/siddhiPlugin/src/com/siddhiPlugin/resources/Siddhi.g4 by ANTLR 4.6
package com.siddhiPlugin.resources;

	//import org.wso2.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SiddhiParser}.
 */
public interface SiddhiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SiddhiParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SiddhiParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SiddhiParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SiddhiParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#execution_plan}.
	 * @param ctx the parse tree
	 */
	void enterExecution_plan(SiddhiParser.Execution_planContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#execution_plan}.
	 * @param ctx the parse tree
	 */
	void exitExecution_plan(SiddhiParser.Execution_planContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void enterExecution_element(SiddhiParser.Execution_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#execution_element}.
	 * @param ctx the parse tree
	 */
	void exitExecution_element(SiddhiParser.Execution_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream_final(SiddhiParser.Definition_stream_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_stream_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream_final(SiddhiParser.Definition_stream_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_stream(SiddhiParser.Definition_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_stream}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_stream(SiddhiParser.Definition_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table_final(SiddhiParser.Definition_table_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_table_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table_final(SiddhiParser.Definition_table_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_table(SiddhiParser.Definition_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_table}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_table(SiddhiParser.Definition_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window_final(SiddhiParser.Definition_window_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_window_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window_final(SiddhiParser.Definition_window_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_window(SiddhiParser.Definition_windowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_window}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_window(SiddhiParser.Definition_windowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function_final(SiddhiParser.Definition_function_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_function_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function_final(SiddhiParser.Definition_function_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_function(SiddhiParser.Definition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_function}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_function(SiddhiParser.Definition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SiddhiParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SiddhiParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(SiddhiParser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(SiddhiParser.Language_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SiddhiParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SiddhiParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger_final(SiddhiParser.Definition_trigger_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger_final(SiddhiParser.Definition_trigger_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_trigger(SiddhiParser.Definition_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#definition_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_trigger(SiddhiParser.Definition_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SiddhiParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SiddhiParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SiddhiParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SiddhiParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#plan_annotation}.
	 * @param ctx the parse tree
	 */
	void enterPlan_annotation(SiddhiParser.Plan_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#plan_annotation}.
	 * @param ctx the parse tree
	 */
	void exitPlan_annotation(SiddhiParser.Plan_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_element(SiddhiParser.Annotation_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#annotation_element}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_element(SiddhiParser.Annotation_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(SiddhiParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(SiddhiParser.PartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void enterPartition_final(SiddhiParser.Partition_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#partition_final}.
	 * @param ctx the parse tree
	 */
	void exitPartition_final(SiddhiParser.Partition_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void enterPartition_with_stream(SiddhiParser.Partition_with_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#partition_with_stream}.
	 * @param ctx the parse tree
	 */
	void exitPartition_with_stream(SiddhiParser.Partition_with_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void enterCondition_ranges(SiddhiParser.Condition_rangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#condition_ranges}.
	 * @param ctx the parse tree
	 */
	void exitCondition_ranges(SiddhiParser.Condition_rangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void enterCondition_range(SiddhiParser.Condition_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#condition_range}.
	 * @param ctx the parse tree
	 */
	void exitCondition_range(SiddhiParser.Condition_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#query_final}.
	 * @param ctx the parse tree
	 */
	void enterQuery_final(SiddhiParser.Query_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#query_final}.
	 * @param ctx the parse tree
	 */
	void exitQuery_final(SiddhiParser.Query_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SiddhiParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SiddhiParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#query_input}.
	 * @param ctx the parse tree
	 */
	void enterQuery_input(SiddhiParser.Query_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#query_input}.
	 * @param ctx the parse tree
	 */
	void exitQuery_input(SiddhiParser.Query_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stream(SiddhiParser.Standard_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#standard_stream}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stream(SiddhiParser.Standard_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stream(SiddhiParser.Join_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#join_stream}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stream(SiddhiParser.Join_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#join_source}.
	 * @param ctx the parse tree
	 */
	void enterJoin_source(SiddhiParser.Join_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#join_source}.
	 * @param ctx the parse tree
	 */
	void exitJoin_source(SiddhiParser.Join_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void enterPattern_stream(SiddhiParser.Pattern_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#pattern_stream}.
	 * @param ctx the parse tree
	 */
	void exitPattern_stream(SiddhiParser.Pattern_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterEvery_pattern_source_chain(SiddhiParser.Every_pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitEvery_pattern_source_chain(SiddhiParser.Every_pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source_chain(SiddhiParser.Pattern_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source_chain(SiddhiParser.Pattern_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_source(SiddhiParser.Pattern_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#pattern_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_source(SiddhiParser.Pattern_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterLogical_stateful_source(SiddhiParser.Logical_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitLogical_stateful_source(SiddhiParser.Logical_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterPattern_collection_stateful_source(SiddhiParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitPattern_collection_stateful_source(SiddhiParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterStandard_stateful_source(SiddhiParser.Standard_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitStandard_stateful_source(SiddhiParser.Standard_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source(SiddhiParser.Basic_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#basic_source}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source(SiddhiParser.Basic_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handlers(SiddhiParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handlers(SiddhiParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void enterBasic_source_stream_handler(SiddhiParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 */
	void exitBasic_source_stream_handler(SiddhiParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void enterSequence_stream(SiddhiParser.Sequence_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#sequence_stream}.
	 * @param ctx the parse tree
	 */
	void exitSequence_stream(SiddhiParser.Sequence_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source_chain(SiddhiParser.Sequence_source_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source_chain(SiddhiParser.Sequence_source_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_source(SiddhiParser.Sequence_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#sequence_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_source(SiddhiParser.Sequence_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void enterSequence_collection_stateful_source(SiddhiParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 */
	void exitSequence_collection_stateful_source(SiddhiParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_stream(SiddhiParser.Anonymous_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#anonymous_stream}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_stream(SiddhiParser.Anonymous_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(SiddhiParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(SiddhiParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void enterStream_function(SiddhiParser.Stream_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#stream_function}.
	 * @param ctx the parse tree
	 */
	void exitStream_function(SiddhiParser.Stream_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(SiddhiParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(SiddhiParser.WindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#query_section}.
	 * @param ctx the parse tree
	 */
	void enterQuery_section(SiddhiParser.Query_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#query_section}.
	 * @param ctx the parse tree
	 */
	void exitQuery_section(SiddhiParser.Query_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#group_by}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by(SiddhiParser.Group_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#group_by}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by(SiddhiParser.Group_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(SiddhiParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(SiddhiParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#query_output}.
	 * @param ctx the parse tree
	 */
	void enterQuery_output(SiddhiParser.Query_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#query_output}.
	 * @param ctx the parse tree
	 */
	void exitQuery_output(SiddhiParser.Query_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_event_type(SiddhiParser.Output_event_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#output_event_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_event_type(SiddhiParser.Output_event_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate(SiddhiParser.Output_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#output_rate}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate(SiddhiParser.Output_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_rate_type(SiddhiParser.Output_rate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#output_rate_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_rate_type(SiddhiParser.Output_rate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#within_time}.
	 * @param ctx the parse tree
	 */
	void enterWithin_time(SiddhiParser.Within_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#within_time}.
	 * @param ctx the parse tree
	 */
	void exitWithin_time(SiddhiParser.Within_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOutput_attribute(SiddhiParser.Output_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#output_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOutput_attribute(SiddhiParser.Output_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SiddhiParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SiddhiParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SiddhiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SiddhiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_math_operation(SiddhiParser.Multiplication_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_math_operation(SiddhiParser.Multiplication_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan_lessthan_math_operation(SiddhiParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan_lessthan_math_operation(SiddhiParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterBasic_math_operation(SiddhiParser.Basic_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitBasic_math_operation(SiddhiParser.Basic_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterIn_math_operation(SiddhiParser.In_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitIn_math_operation(SiddhiParser.In_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAddition_math_operation(SiddhiParser.Addition_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAddition_math_operation(SiddhiParser.Addition_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_math_operation(SiddhiParser.And_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_math_operation(SiddhiParser.And_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterOr_math_operation(SiddhiParser.Or_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitOr_math_operation(SiddhiParser.Or_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterEquality_math_operation(SiddhiParser.Equality_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitEquality_math_operation(SiddhiParser.Equality_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void enterNot_math_operation(SiddhiParser.Not_math_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiParser#math_operation}.
	 * @param ctx the parse tree
	 */
	void exitNot_math_operation(SiddhiParser.Not_math_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_operation(SiddhiParser.Function_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#function_operation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_operation(SiddhiParser.Function_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(SiddhiParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(SiddhiParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#null_check}.
	 * @param ctx the parse tree
	 */
	void enterNull_check(SiddhiParser.Null_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#null_check}.
	 * @param ctx the parse tree
	 */
	void exitNull_check(SiddhiParser.Null_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void enterStream_reference(SiddhiParser.Stream_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#stream_reference}.
	 * @param ctx the parse tree
	 */
	void exitStream_reference(SiddhiParser.Stream_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(SiddhiParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(SiddhiParser.Attribute_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_index(SiddhiParser.Attribute_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute_index}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_index(SiddhiParser.Attribute_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#function_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_id(SiddhiParser.Function_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#function_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_id(SiddhiParser.Function_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void enterFunction_namespace(SiddhiParser.Function_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#function_namespace}.
	 * @param ctx the parse tree
	 */
	void exitFunction_namespace(SiddhiParser.Function_namespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void enterStream_id(SiddhiParser.Stream_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#stream_id}.
	 * @param ctx the parse tree
	 */
	void exitStream_id(SiddhiParser.Stream_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#stream_alias}.
	 * @param ctx the parse tree
	 */
	void enterStream_alias(SiddhiParser.Stream_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#stream_alias}.
	 * @param ctx the parse tree
	 */
	void exitStream_alias(SiddhiParser.Stream_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#property_name}.
	 * @param ctx the parse tree
	 */
	void enterProperty_name(SiddhiParser.Property_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#property_name}.
	 * @param ctx the parse tree
	 */
	void exitProperty_name(SiddhiParser.Property_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(SiddhiParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(SiddhiParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SiddhiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SiddhiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#property_value}.
	 * @param ctx the parse tree
	 */
	void enterProperty_value(SiddhiParser.Property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#property_value}.
	 * @param ctx the parse tree
	 */
	void exitProperty_value(SiddhiParser.Property_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void enterProperty_separator(SiddhiParser.Property_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#property_separator}.
	 * @param ctx the parse tree
	 */
	void exitProperty_separator(SiddhiParser.Property_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(SiddhiParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(SiddhiParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(SiddhiParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(SiddhiParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(SiddhiParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(SiddhiParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SiddhiParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SiddhiParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#collect}.
	 * @param ctx the parse tree
	 */
	void enterCollect(SiddhiParser.CollectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#collect}.
	 * @param ctx the parse tree
	 */
	void exitCollect(SiddhiParser.CollectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_type(SiddhiParser.Attribute_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_type(SiddhiParser.Attribute_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SiddhiParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SiddhiParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(SiddhiParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(SiddhiParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SiddhiParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SiddhiParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SiddhiParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SiddhiParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#time_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_value(SiddhiParser.Time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#time_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_value(SiddhiParser.Time_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#year_value}.
	 * @param ctx the parse tree
	 */
	void enterYear_value(SiddhiParser.Year_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#year_value}.
	 * @param ctx the parse tree
	 */
	void exitYear_value(SiddhiParser.Year_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#month_value}.
	 * @param ctx the parse tree
	 */
	void enterMonth_value(SiddhiParser.Month_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#month_value}.
	 * @param ctx the parse tree
	 */
	void exitMonth_value(SiddhiParser.Month_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#week_value}.
	 * @param ctx the parse tree
	 */
	void enterWeek_value(SiddhiParser.Week_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#week_value}.
	 * @param ctx the parse tree
	 */
	void exitWeek_value(SiddhiParser.Week_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#day_value}.
	 * @param ctx the parse tree
	 */
	void enterDay_value(SiddhiParser.Day_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#day_value}.
	 * @param ctx the parse tree
	 */
	void exitDay_value(SiddhiParser.Day_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void enterHour_value(SiddhiParser.Hour_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#hour_value}.
	 * @param ctx the parse tree
	 */
	void exitHour_value(SiddhiParser.Hour_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void enterMinute_value(SiddhiParser.Minute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#minute_value}.
	 * @param ctx the parse tree
	 */
	void exitMinute_value(SiddhiParser.Minute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#second_value}.
	 * @param ctx the parse tree
	 */
	void enterSecond_value(SiddhiParser.Second_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#second_value}.
	 * @param ctx the parse tree
	 */
	void exitSecond_value(SiddhiParser.Second_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void enterMillisecond_value(SiddhiParser.Millisecond_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#millisecond_value}.
	 * @param ctx the parse tree
	 */
	void exitMillisecond_value(SiddhiParser.Millisecond_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_double_value(SiddhiParser.Signed_double_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#signed_double_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_double_value(SiddhiParser.Signed_double_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_long_value(SiddhiParser.Signed_long_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#signed_long_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_long_value(SiddhiParser.Signed_long_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_float_value(SiddhiParser.Signed_float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#signed_float_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_float_value(SiddhiParser.Signed_float_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int_value(SiddhiParser.Signed_int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#signed_int_value}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int_value(SiddhiParser.Signed_int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(SiddhiParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(SiddhiParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SiddhiParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(SiddhiParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SiddhiParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(SiddhiParser.String_valueContext ctx);
}