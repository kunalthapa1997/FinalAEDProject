/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.tasks;

import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class TaskQueue {
      private ArrayList<TaskRequest> workRequestList;

    public TaskQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<TaskRequest> getWorkRequestList() {
        return workRequestList;
    }
}
