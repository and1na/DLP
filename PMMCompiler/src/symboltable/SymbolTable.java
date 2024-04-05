package symboltable;

import java.util.*;
import ast.definition.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<>());
	}

	public void set() {
		scope++;
		//New scope is added
		table.add(new HashMap<>());
	}
	
	public void reset() {
		//Deeper scope is removed
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		//Inserting new definition if its not defined yet
			//Set scope in which the definition its defined
		definition.setScope(scope);
		//If it's defined, return false
		if(table.get(scope).containsKey(definition.getName())){
			return false;
		}
		//If not, insert and return true
		table.get(scope).put(definition.getName(), definition);
		return true;
	}
	
	public Definition find(String id) {

		//i have to look up into the scopes in descending order
		for(int scope = table.size()-1 ; scope >= 0; scope--) {
			if (table.get(scope).containsKey(id)) {
				return table.get(scope).get(id);
			}
		}
		//If not, return null
		return null;
	}

	public Definition findInCurrentScope(String id) {
		Map<String,Definition> currentScope = table.get(scope);
		//If current scope contains definition with key "id" return it
		if(currentScope.containsKey(id)) return currentScope.get(id);
		//If not, return null
		return null;
	}
}
