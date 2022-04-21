import React, {Component} from 'react';
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faAdd} from '@fortawesome/free-solid-svg-icons'

class TodoForm extends Component {

    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    // componentDidMount() {
    //
    // }

    // const [inputValue, setInputValue] = useState('');

    async handleSubmit(event) {
        event.preventDefault();
        setInputValue('');
    };

    render() {
        return (
            <form className='todo-form'>
                <input
                    type='text'
                    placeholder='Add a todo'
                    value={inputValue}
                    className='todo-input'
                    onChange={e => setInputValue(e.target.value)}
                />
                <button type={"submit"} onSubmit={handleSubmit}>
                    <FontAwesomeIcon icon={faAdd}/>
                </button>
            </form>
        )
    }
}

export default TodoForm;