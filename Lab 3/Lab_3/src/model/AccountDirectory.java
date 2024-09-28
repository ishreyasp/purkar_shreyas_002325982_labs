/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * Model to hold list of account details
 * 
 * @author Shreyas Purkar
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;

    public AccountDirectory() {
        accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    /**
     * Method to add new account
     * 
     * @return account object
     */
    public Account addAccount() {
        Account account = new Account();
        accounts.add(account);
        return account;
    }
    
    /**
     * Method to delete existing account
     * 
     * @param account object to be deleted
     */
    public void deleteAccount(Account account) {
        accounts.remove(account);
    }
}
