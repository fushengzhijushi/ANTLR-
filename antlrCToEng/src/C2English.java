
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;

import java.io.*;


public class C2English {
    public static class CFileLoader extends CBaseListener {
    	ParseTreeProperty<String> Eng = new ParseTreeProperty<String>();
    	String buf = new String();
    	String getENG(ParseTree ctx) { return Eng.get(ctx); }
        void setENG(ParseTree ctx, String s) { Eng.put(ctx, s); }
        
        public void exitC(CParser.CContext ctx) {
        	buf="";
        	for(int i=0;i<ctx.getChildCount();i++) {
        		buf=buf+getENG(ctx.getChild(i));
        	}
        	setENG(ctx,buf);
        }
        
         
        public void exitStart(CParser.StartContext ctx) {
        	buf="HeadFile:\n";
            buf=buf+ctx.HEADFILE().toString();
            buf+="\n"+ctx.HEAD_DECLARE().getText();
        	buf=buf+"\n\n";
        	setENG(ctx, buf);
        }
       
        
        public void exitGlobal(CParser.GlobalContext ctx) {
        	buf="";
        	for(int i=0;i<ctx.getChildCount();i++) {
        		buf=buf+getENG(ctx.getChild(i));
        	}
        	setENG(ctx,buf);	
        }
        
        public void exitStructure(CParser.StructureContext ctx) {
        	buf="define a struct whose tag is ";
        	buf+=ctx.STRING(0).toString()+" including elements are as follows: \n"+getENG(ctx.structure_body());
        	if(ctx.STRING().size()>1) {
        		buf=buf+ctx.STRING(1).getText();
        		//if(getENG(ctx.getChild(5)).toString()=="[") {
        			//buf+='['+ctx.INTEGER().getText()+']';
        		//}
        		buf+=" as its varilab-list. "+"\n\n";
        		setENG(ctx,buf);
        	}
        }
        
        public void exitStructure_body(CParser.Structure_bodyContext ctx) { 
        	buf="";
        	for(int i=0;i<ctx.struct_body_body().size();i++) {
        		buf+=getENG(ctx.struct_body_body(i))+"\n";
        	}
        	//buf+='\n';
        	setENG(ctx,buf);
        }
        public void exitStruct_body_body(CParser.Struct_body_bodyContext ctx) { 
        	setENG(ctx,getENG(ctx.getChild(0)));
        }
        
        public void exitFunc(CParser.FuncContext ctx) {
        	buf="\ndefine function ";
        	buf=buf+ctx.STRING().toString()+" and ";
        	//String tmp1=new String();
        	for(int i=0;i<ctx.defvarfun().size();i++) {
        		buf+=getENG(ctx.defvarfun(i));
        	}
        	buf+=" as variables. ";
        	for(int i=0;i<ctx.both().size();i++) {
        		buf+=getENG(ctx.both(i));
        	}
        	
        	buf+='\n';
        	
        	setENG(ctx,buf);	
        }
        
        public void exitDefvarfun(CParser.DefvarfunContext ctx) {
        	if(ctx.getChildCount()==2) buf="define "+ctx.STRING().toString()+' ';
            else {	
            	buf="define "+ctx.STRING().toString()+"[]";
            }  
        	//buf+='\n';
        	setENG(ctx,buf);	
        }
        
        public void exitBot(CParser.BotContext ctx) {
        	buf="";
        	for(int i=0;i<ctx.both().size();i++) {
        		if(getENG(ctx.both(i))!=null)
        		  buf=buf+getENG(ctx.both(i));
        	}
        	setENG(ctx,buf);
        }
        
        public void exitBoth(CParser.BothContext ctx) {
        	setENG(ctx,getENG(ctx.getChild(0)));
        	
        }
       
        public void exitStat(CParser.StatContext ctx) { 
        	setENG(ctx,getENG(ctx.getChild(0)));
        }
        
        public void exitReturn_val(CParser.Return_valContext ctx) { 
        	buf ='\n'+ctx.value().getText()+" as the return vlaue.\n";
        	setENG(ctx,buf);
        }
        
        public void exitValue(CParser.ValueContext ctx) { 
        	buf="";
        	buf+=getENG(ctx.getChild(0));
        	buf+='\n';
        	setENG(ctx,buf);
        			
        }
        
        public void exitDefvar(CParser.DefvarContext ctx) {
        	buf="define ";
        	String tmp1=new String();
        	for(int i=1;i<ctx.getChildCount();i++) {
        	    tmp1=getENG(ctx.getChild(i));
        	    if(tmp1!=null&tmp1!="\n") buf+=tmp1;
        	}
        	//buf=buf+'\n';
        	setENG(ctx,buf);	
        }
        
        public void exitDefineassign(CParser.DefineassignContext ctx) {
        	setENG(ctx,getENG(ctx.getChild(0)));	
        }
        
        
        public void exitDesimplevar(CParser.DesimplevarContext ctx) {
        	setENG(ctx,ctx.STRING().getText()+' ');
        }
        
        public void exitDefinarrayvar(CParser.DefinarrayvarContext ctx) {
        	setENG(ctx,"array "+ctx.STRING().getText()+'['+ctx.INTEGER(0).getText()+']'+" ");
        }
        
        public void exitAssign(CParser.AssignContext ctx) {
        	buf="";
        	if(ctx.getChildCount()>1) {
        		buf+=ctx.STRING().getText();
        		buf+="'s ";
        	}
        	buf=buf+getENG(ctx.assign_rear());
        	setENG(ctx,buf);
        }
    	
        
        public void exitVariable(CParser.VariableContext ctx) { 
        	buf=ctx.STRING().getText()+" equal "+ctx.value().getText()+'\n';
        	setENG(ctx,buf);
        }
        
        public void exitArray(CParser.ArrayContext ctx) {
        	buf="\narray "+ctx.STRING().getText()+'['+ctx.INTEGER().toString()+']';
        	//buf="array "+ctx.STRING().getText()+'['+ctx.INTEGER().getText()+']';
        	buf+=" equal "+(ctx.value().getText())+'\n';
        	setENG(ctx,buf);
        }
       
        public void exitIn(CParser.InContext ctx) { 
        	buf="\ninput:";
        	String temp=new String();
        	for(int i=0;i<ctx.STRING().size();i++) {
        	    temp=ctx.STRING(i).getText()+" ";
        	    if(temp!=null) buf+=temp;
        	}
        	buf+='\n';
        	setENG(ctx,buf);	
        }
        
        
       
        public void exitSelfincrease(CParser.SelfincreaseContext ctx) {
        	setENG(ctx,ctx.STRING().toString()+" selfincrease ");
        }
        
        public void exitSelfdecrease(CParser.SelfdecreaseContext ctx) {
        	setENG(ctx,ctx.STRING().toString()+" selfincrease ");
        }
       
    	
        public void exitMain(CParser.MainContext ctx) {
        	buf="\nmain_function\n";
        	for(int i=0;i<ctx.both().size();i++) {
        		buf+=getENG(ctx.both(i));
        	}
        	setENG(ctx,buf);
        }
        
        public void exitBlock(CParser.BlockContext ctx) { 
        	setENG(ctx,getENG(ctx.getChild(0)));	
        }
          
        public void exitFor_lable(CParser.For_lableContext ctx) {
        	buf="start from ";
        	buf+=getENG(ctx.defvar());
        	buf=buf.substring(0, buf.length()-1);
        	
        	buf+="\nrepeat the loop as long as ";
        	buf+=getENG(ctx.condition())+" and ";
        	buf+=getENG(ctx.assign())+"after each loop:";
        	buf+='\n';
        	for(int i=0;i<ctx.both().size();i++) {
        		buf+=getENG(ctx.both(i));
        	}
           buf+='\n';
           buf+="this is the end of for.\n";
        	setENG(ctx,buf);
        }
        
        public void exitCondition(CParser.ConditionContext ctx) { 
        	buf="";
        	buf+=getENG(ctx.and(0));
        	for(int i=1;i<ctx.and().size();i++) {
        		buf+="and"+getENG(ctx.and(i));
        	}
        	
        	setENG(ctx,buf);	
        }
        
        public void exitAnd(CParser.AndContext ctx) {
        	buf="";
        	for(int i=0;i<ctx.atomc().size();i++) {
        		buf+=getENG(ctx.atomc(i));
        	}
        	setENG(ctx,buf);
        }
        
        public void exitAtomc(CParser.AtomcContext ctx) {
        	setENG(ctx,getENG(ctx.conexpr()));
        }
        
        public void exitLess(CParser.LessContext ctx) {
        	buf="";
        	buf=getENG(ctx.condition_part(0));
        	buf= buf+"<";
        	buf=buf+getENG(ctx.condition_part(1));
        	setENG(ctx,buf);
        }
        
        public void exitEqual( CParser.EqualContext ctx) {
        	buf="";
        	buf=getENG(ctx.condition_part(0));
        	buf= buf+"==";
        	buf=buf+getENG(ctx.condition_part(1));
        	setENG(ctx,buf);
        }
        
        public void exitUnequal( CParser.UnequalContext ctx) {
        	buf="";
        	buf=getENG(ctx.condition_part(0));
        	buf= buf+"!=";
        	buf=buf+getENG(ctx.condition_part(1));
        	setENG(ctx,buf);
        }
        
        public void exitGreater( CParser.GreaterContext ctx) {
        	buf="";
        	buf=getENG(ctx.condition_part(0));
        	buf= buf+">";
        	buf=buf+getENG(ctx.condition_part(1));
        	setENG(ctx,buf);
        }
        
        public void exitCondition_part( CParser.Condition_partContext ctx) {
        	buf="";
        	buf=buf+getENG(ctx.getChild(0));
        	setENG(ctx,buf);
        }
      
        
        public void exitExpr(CParser.ExprContext ctx) {
        	setENG(ctx,getENG(ctx.addexpr()));
        }
        
        public void exitAddexpr(CParser.AddexprContext ctx) {
        	setENG(ctx,getENG(ctx.mulexpr(0)));
        }
        
        public void exitMulexpr(CParser.MulexprContext ctx) {
        	setENG(ctx,getENG(ctx.atom(0)));
        }
        
        public void exitAtom(CParser.AtomContext ctx) {
        	setENG(ctx,ctx.getText());
        }
        
        public void exitWhile_lable(CParser.While_lableContext ctx) {
        	buf="\nwhile "+getENG(ctx.condition())+" is true:";
        	for(int i=0;i<ctx.both().size();i++) {
        		buf+=getENG(ctx.both(i));
        	}
        	buf+="this is the end of while.\n\n";
        	setENG(ctx,buf);
        }
        
        public void exitOut(CParser.OutContext ctx) { 
        	buf="output:";
        	String temp=new String();
        	for(int i=0;i<ctx.STRING().size();i++) {
        	    temp=ctx.STRING(i).getText();
        	    if(temp!=null) buf+=temp;
        	}
        	buf+='\n';
        	setENG(ctx,buf);	
        }
        
        public void exitCall(CParser.CallContext ctx) { 
        	buf="call function ";
        	int count = ctx.STRING().size();  
        	if(count==0)	buf+=ctx.STRING(0).toString()+" ";
        	if(count>0) {
        		buf+=ctx.STRING(0).toString()+" using ";
        		for(int i=1;i<ctx.STRING().size();i++) {
        			buf+=ctx.STRING(i).toString()+" ";
        			if(i==count-1)	 buf+=" as varilables. ";
        		}
        	}
    		buf+="\n\n";
    		setENG(ctx,buf);	
        }
        
		 public void exitIf_lable(CParser.If_lableContext ctx) {
			buf="";
			String tmp1=new String();
			buf+=getENG(ctx.if_part());
        	for(int i=0;i<ctx.else_if_part().size();i++) {
        	    tmp1=getENG(ctx.else_if_part(i));
        	    if(tmp1!=null) buf+=tmp1;
        	}
        	buf+=getENG(ctx.else_part());
			setENG(ctx,buf);	 
		 }
		 public void exitIf_part(CParser.If_partContext ctx) {
			 buf="";
			 buf+="if "+ ctx.condition().getText().toString()+ " is true: "+getENG(ctx.bot());
			// buf+='\n';
			 setENG(ctx,buf);	
		 }
		 	
		 public void exitElse_if_part(CParser.Else_if_partContext ctx) {
			 buf="";
			 buf+="else if "+ getENG(ctx.condition())+ " is true: \n"+getENG(ctx.bot());
			 buf+='\n';
			 setENG(ctx,buf);	
		 }
		 
		 public void exitElse_part(CParser.Else_partContext ctx) {
			 buf="";
			 if(ctx.getChildCount()!=0) buf+="else:\n"+getENG(ctx.bot()).toString();
			 //buf+='\n';
			 buf+="this is the end of if.\n";
			 setENG(ctx,buf);	
		 }
      
    }
    
    	
    
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        CLexer lexer = new CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        ParseTree tree = parser.c();

        //System.out.println(tree.toStringTree(parser));
        // create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // create listener then feed to walker
        CFileLoader loader = new CFileLoader();
        walker.walk(loader, tree);        // walk parse tree
        System.out.println(loader.getENG(tree)); // print results
    }
}
