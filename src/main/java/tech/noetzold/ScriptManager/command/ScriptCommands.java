package tech.noetzold.ScriptManager.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import tech.noetzold.ScriptManager.service.CodeCompilationService;

@ShellComponent
public class ScriptCommands {

    private final CodeCompilationService codeCompilationService;

    public ScriptCommands(CodeCompilationService codeCompilationService) {
        this.codeCompilationService = codeCompilationService;
    }

    @ShellMethod(key = "show_all", value = "List the scripts")
    public void showAll(){
        System.out.println();
    }

    @ShellMethod(key = "add_new", value="Add new script")
    public void addNew(@ShellOption String lang, @ShellOption String pathSource){
        System.out.println(codeCompilationService.compileCode(lang, pathSource));
    }

    @ShellMethod(key = "compile", value = "Compile a script")
    public void compileScript(){

    }
    @ShellMethod(key = "result", value = "See the compile result")
    public void seeResult(){

    }
}
