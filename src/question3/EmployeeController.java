package question3;



public class EmployeeController {
	
	public EmployeeController(Employee model, WindowView window) {
		window.setSaveButtonListener(new SaveButtonListener() {
			
			@Override
			public void saveButtonClicked(SaveButtonEventObject ev) {
				model.setName(ev.getName());
				model.setId(ev.getId());
				model.setPhoneNum(ev.getPhoneNum());
				model.setAddress(ev.getAddress());
				model.setJobTitle(ev.getJobTitle());
				
				
			}
		});
	/*
		ProjectData data = new ProjectData();
		window.loadSaveButtonListener(new SaveButtonListener()
				{

					@Override
					public void saveButtonClicked(SaveButtonEventObject ev) 
					{
						String id = (model.getName());
						ev = data.searchArray(id, data);
						data.loadBinaryDataToArrays(data);
					}
				
				
				});
		
		*/
	}
}