package tech.noetzold.ScriptManager.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ScriptCommands {

    @ShellMethod(key = "show_all", value = "List the scripts")
    public void showAll(){

    }

    @ShellMethod(key = "add_new", value="Add new script")
    public void addNew(@ShellOption String lang, @ShellOption String pathSource){

    }

    @ShellMethod(key = "compile", value = "Compile a script")
    public void compileScript(){

    }
    @ShellMethod(key = "result", value = "See the compile result")
    public void seeResult(){

    }
}
